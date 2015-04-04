Ext.define('Lilac.view.main.MainController', {
  extend: 'Ext.app.ViewController',
  xtype: 'lilac.view.main.maincontroller',
  alias: 'controller.lilac.view.main.maincontroller',
  requires: ["Lilac.view.main.NavHistory"],
  init: function() {
  },
  setPageTitle: function(contentTitle) {
    contentTitle = Ext.util.Format.stripTags(contentTitle);
    if (!this.origTitle) {
      this.origTitle = document.title;
    }
    document.title = contentTitle ? (contentTitle + " - " + this.origTitle) : this.origTitle
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
