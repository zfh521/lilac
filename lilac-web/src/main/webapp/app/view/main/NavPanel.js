Ext.define("Lilac.view.main.NavPanel", {
  extend: "Ext.panel.Panel",
  xtype: "lilac.view.main.navpanel",
  requires: ['Lilac.view.main.NavTree', 'Lilac.view.main.NavController', 'Lilac.view.main.NavModel'],
  reference: 'navPanel',
  layout: {
    type: 'accordion',
    animate: true
  },
  initComponent: function() {
    this.items = [{
      title: '工艺规划',
      border: false,
      iconCls: 'nav',
      collapsible: true,
      items: [{
        xtype: 'lilac.view.main.navtree',
        store: Ext.create('Ext.data.TreeStore', {
          model: 'Lilac.view.main.NavModel',
          root: {
            expanded: false,
            children: [{
              text: "产品设置",
              iconCls: 'icon-cog',
              leaf: true,
              url: "1"
            }, {
              text: "homework",
              iconCls: 'iconCls_tableSave',
              expanded: false,
              children: [{
                text: "book report",
                iconCls: 'iconCls_applicationGo',
                leaf: true,
                url: "2.html"
              }, {
                text: "algebra",
                iconCls: 'iconCls_start',
                leaf: true,
                url: "3.html"
              }]
            }, {
              text: "buy lottery tickets",
              iconCls: 'iconCls_pageExcel',
              leaf: true,
              url: "http://180.169.20.135:8099/bugfree/index.php"
            }]
          }
        })
      }]
    }, {
      title: '系统设置',
      border: false,
      iconCls: 'settings',
      collapsible: true,
      items: [{
        xtype: 'lilac.view.main.navtree',
        store: Ext.create('Ext.data.TreeStore', {
          model: 'Lilac.view.main.NavModel',
          root: {
            expanded: false,
            children: [{
              text: "产品设置",
              iconCls: 'icon-cog',
              leaf: true,
              url: "#"
            }, {
              text: "homework",
              expanded: false,
              children: [{
                text: "book report",
                iconCls: 'icon-cog',
                leaf: true,
                url: "#"
              }, {
                text: "algebra",
                leaf: true,
                url: "#"
              }]
            }, {
              text: "buy lottery tickets",
              leaf: true,
              url: "#"
            }]
          }
        })
      }]
    }];
    this.callParent(arguments);
  }
});