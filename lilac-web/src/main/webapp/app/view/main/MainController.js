Ext.define('Lilac.view.main.MainController', {
  extend: 'Ext.app.ViewController',
  xtype: 'lilac.view.main.maincontroller',
  alias: 'controller.lilac.view.main.maincontroller',
  requires: ["Lilac.view.main.NavHistory"],
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
      var mainContentTabPanel = this.lookupReference("mainContentTabPanel");
      mainContentTabPanel.getController().loadMainContent(navModel);
      this.getView().setPageTitle(navModel.title);
    }
  },
  opensNewWindow: function(b) {
    return b.button === this.MIDDLE || b.shiftKey || b.ctrlKey
  },
  onClickLogo: function(e) {
  },
  onClickUserCenter: function(e) {
    window.location = '/lilac';
  },
  onClickLogout: function(e) {
    window.location = '/lilac/logout';
  }
});
