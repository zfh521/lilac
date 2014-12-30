Ext.define('Lilac.view.main.ContentController', {
  extend: 'Lilac.ux.app.ViewController',
  xtype: 'lilac.view.main.contentcontroller',
  alias: 'controller.lilac.view.main.contentcontroller',
  MIDDLE: 1,
  requires: ["Lilac.view.main.NavHistory"],
  cache: {},
  init: function() {
  },
  loadMainContent: function(navModel, i) {
    i || Lilac.view.main.NavHistory.push(navModel.url);
    var url = navModel.url;
    var contentPanel = this.getView();
    if (contentPanel) {
      contentPanel.setLoading(true);
    }
    if (this.cache[url]) {
      this.showContent(this.cache[url]);
    } else {
      this.cache[url] = "in-progress";
      if (navModel.iframe) {
        Ext.Ajax.request({
          url: navModel.url,
          success: function(response, request) {
            var ItemModule = eval(response.responseText);
            this.loadContent(navModel, {
              item: new ItemModule()
            });
          },
          failure: function(response, request) {
            this.cache[url] = false;
            contentPanel.setLoading(false);
            this.getController("Failure").show404("Page <b>" + Ext.String.htmlEncode(url) + "</b> was not found.")
          },
          scope: this
        })
      } else {
        this.loadContent(navModel, {
          html: this.getHtml(navModel.url)
        });
      }
    }
  },
  loadContent: function(navModel, tabCfg) {
    var contentPanel = this.getView();
    var tabItem = {
      title: navModel.title,
      iconCls: navModel.iconCls,
      closable: true,
      cacheUrl: navModel.url,
      listeners: {
        removed: "onCloseTab",
        close: "onCloseTab"
      }
    };
    Ext.apply(tabItem, tabCfg);
    tabItem = contentPanel.add(tabItem);
    this.cache[url] = tabItem.id;
    this.showContent(this.cache[url]);
  },
  showContent: function(tabId) {
    this.getView().setActiveTab(tabId);
    this.getView().setLoading(false);
  },
  getHtml: function(url) {
    var b = new Ext.XTemplate('<iframe scrolling="auto" ', 'style="width: 100%; height: 100%; border: 0"',
            'frameBorder="0" src={url}></iframe>');
    return b.apply({
      url: url
    })
  },
  opensNewWindow: function(b) {
    return b.button === this.MIDDLE || b.shiftKey || b.ctrlKey
  },
  onCloseTab: function(panel, eOpts) {
    this.cache[panel.cacheUrl] = false;
  }
});
