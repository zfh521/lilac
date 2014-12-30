Ext.define('Lilac.view.main.ContentPanel', {
  extend: 'Ext.tab.Panel',
  xtype: 'lilac.view.main.contentpanel',
  alias: 'widget.lilac.contentpanel',
  requires: ['Lilac.view.main.ContentController'],
  controller: 'lilac.view.main.contentcontroller',
  requires: ['Lilac.ux.TabCloseMenu'],
  plugins: Ext.create('Lilac.ux.TabCloseMenu'),
  initComponent: function() {
    var me = this;
    Ext.apply(this, {
      items: [{
        title: '我的桌面',
        xtype: 'dashboard',
        reference: 'dashboard',
        stateful: false,
        columnWidths: [0.35, 0.40, 0.25],
        parts: {
          test: {
            viewTemplate: {
              items: [{
                xtype: 'panel',
                html: '<iframe scrolling="auto" frameborder="0"'
                        + 'width="100%" height="100%" src="http://cn.bing.com/"></iframe>'
              }]
            }
          }
        },
        defaultContent: [{
          type: 'test',
          title: '通告',
          columnIndex: 0,
          height: 500
        }, {
          type: 'test',
          columnIndex: 1,
          height: 300
        }, {
          type: 'test',
          columnIndex: 2,
          height: 300
        }]
      }]
    });
    me.callParent(arguments);
  }
});
