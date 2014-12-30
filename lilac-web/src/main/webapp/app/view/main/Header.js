Ext.define('Lilac.view.main.Header', {
  extend: 'Ext.container.Container',
  xtype: 'mainheader',
  cls: 'app-header',
  height: 60,
  layout: {
    type: 'hbox',
    align: 'left'
  },
  items: [{
    xtype: 'component',
    cls: 'app-header-logo',
    listeners: {
      click: 'onClickLogo',
      element: 'el'
    }
  }, {
    xtype: 'component',
    flex: 1
  }, {
    xtype: 'component',
    html: '<a class="app-header-a" ><span class="app-header-n1"></span>系统首页</a>',
    listeners: {
      click: 'onClickUserCenter',
      element: 'el'
    }
  }, {
    xtype: 'component',
    itemId: 'shortcutId',
    html: '<a id="shortcutId" class="app-header-a" ><span class="app-header-n7"></span>快捷导航</a>',
    listeners: {
      mousemove: function(e, target, eOpts) {
        var shortcutCmp = Ext.ComponentQuery.query("#shortcutId")[0];
        var mainHeaderPanel = Ext.ComponentQuery.query("mainheader")[0];
        var shortcutMenu = shortcutCmp.shortcutMenu || Ext.create("Ext.menu.Menu", {
          renderTo: Ext.getBody(),
          plain: true,
          bind: {},
          items: [{
            iconCls: 'iconCls_trash',
            text: "Hello {user.name}"
          }, {
            text: "昨天"
          }]
        });

        if (mainHeaderPanel.activeMenu) {
          mainHeaderPanel.activeMenu.hide();
        }

        shortcutCmp.shortcutMenu = shortcutMenu;
        mainHeaderPanel.activeMenu = shortcutMenu;
        shortcutMenu.showBy(shortcutCmp, "bl", [-2, 0]);
      },
      mouseleave: function(obj, e, target, eOpts) {

      },
      element: 'el',
      scope: 'panel'
    }
  }, {
    xtype: 'component',
    html: '<a id="sysSetupId" class="app-header-a" ><span class="app-header-n3"></span>系统设置</a>',
    listeners: {
      mouseover: function(obj, e, target, eOpts) {

      },
      element: 'el',
      scope: this
    }
  }, {
    xtype: 'component',
    html: '<a id="userCenter" class="app-header-a"><span class="app-header-n4"></span>个人中心</a>',
    listeners: {
      click: 'onClickUserCenter',
      element: 'el'
    }
  }, {
    xtype: 'component',
    html: '<a class="app-header-a" ><span class="app-header-n5"></span>安全退出</a>',
    listeners: {
      click: 'onClickLogout',
      element: 'el'
    }
  }],
  getActiveMenu: function(menuId) {
    alert(1);
    if (menuId == 'shortcutMenuId') { return; }
  }
});