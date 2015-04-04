Ext.define('Lilac.view.main.NavController', {
  extend: 'Ext.app.ViewController',
  xtype: 'lilac.view.main.navcontroller',
  alias: 'controller.lilac.view.main.navcontroller',
  MIDDLE: 1,
  requires: ["Lilac.view.main.NavHistory"],
  cache: {},
  init: function() {
  },
  onUrlClick: function(view, record, e) {
    this.handleUrlClick(view, record, e);
  },
  handleUrlClick: function(view, navModel, e) {
    url = Lilac.view.main.NavHistory.cleanUrl(navModel.url);
    if (this.opensNewWindow(e)) {
      window.open(url);
      view && view.selectUrl(url)
    } else {
      var navPanel = this.getView();
      var viewport = navPanel.up("viewport");
      var mainContentTabPanel = viewport.down("tabpanel");
      viewport.getController().setPageTitle(navModel.title);
      this.loadMainContent(navModel);
    }
  },
  opensNewWindow: function(b) {
    return b.button === this.MIDDLE || b.shiftKey || b.ctrlKey
  },
  loadMainContent: function(navModel, i) {
    i || Lilac.view.main.NavHistory.push(navModel.url);
    var navPanel = this.getView();
    var viewport = navPanel.up("viewport");
    var contentPanel = viewport.down("tabpanel");
    var menuId = navModel.menuId;

    if (contentPanel) {
      contentPanel.setLoading(true);
    }
    if (this.cache[menuId]) {
      contentPanel.setLoading(false);
      var ItemModule = this.cache[menuId];
      if (!navModel.iframe) {
        var tabItem = new ItemModule();
        contentPanel.getController().loadContent(navModel, tabItem);
      } else {
        var tabItem = this.cache[menuId];
        contentPanel.getController().loadContent(navModel, tabItem);
      }
    } else {
      // load component
      if (!navModel.iframe) {
        Ext.Ajax.request({
          url: navModel.url,
          success: function(response, request) {
            contentPanel.setLoading(false);
            var ItemModule = eval(response.responseText);
            this.cache[menuId] = ItemModule;
            var tabItem = new ItemModule();
            contentPanel.getController().loadContent(navModel, tabItem);
          },
          failure: function(response, request) {
            contentPanel.setLoading(false);
            this.getController("Failure").show404("Page <b>" + Ext.String.htmlEncode(url) + "</b> was not found.")
          },
          scope: this
        });
      } else {// load jsp by iframe
        contentPanel.setLoading(false);
        var tabItem = {
          xtype: 'panel',
          html: this.getHtml(navModel.url)
        };
        this.cache[menuId] = tabItem;
        contentPanel.getController().loadContent(navModel, tabItem);
      }
    }
  },
  getHtml: function(url) {
    var b = new Ext.XTemplate('<iframe scrolling="auto" ', 'style="width: 100%; height: 100%; border: 0"',
            'frameBorder="0" src={url}></iframe>');
    return b.apply({
      url: url
    })
  }
});
