Ext.define('Lilac.view.main.ContentController', {
  extend: 'Lilac.ux.app.ViewController',
  xtype: 'lilac.view.main.contentcontroller',
  alias: 'controller.lilac.view.main.contentcontroller',
  requires: ["Lilac.view.main.NavHistory"],
  init: function() {
  },
  /**
   * Load the module or jsp to content
   */
  loadContent: function(navModel, tabItem) {
    var contentPanel = this.getView();
    var tabItemId = this.getTabItemId(navModel.menuId);
    if (!tabItemId) {
      var tabCfg = {
        menuId: navModel.menuId,
        title: navModel.title,
        iconCls: navModel.iconCls,
        closable: true,
        layout: 'fit'
      };

      Ext.apply(tabItem, tabCfg);
      tabItem = contentPanel.add(tabItem);
      tabItemId = tabItem.id;
    }
    this.showContent(tabItemId);
  },
  showContent: function(tabItemId) {
    this.getView().setActiveTab(tabItemId);
  },
  getTabItemId: function(menuId) {
    var contentPanel = this.getView();
    var tabItemId;
    contentPanel.items.each(function(item) {
      if (item.menuId == menuId) {
        tabItemId = item.id;
        return false;
      }
    });
    return tabItemId;
  },
  onCloseTab: function() {
    // fire close tab action
  }
});