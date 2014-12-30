Ext.define('Lilac.view.security.login.Login', {
  extend: 'Ext.window.Window',
  xtype: 'loginwin',
  alias: 'widget.loginwin',
  requires: ['Lilac.view.security.login.LoginController', 'Lilac.view.security.login.LoginModel',
      'Lilac.model.security.Organization'],
  controller: 'lilac.view.main.contentcontroller',
  viewModel: 'login',
  controller: 'login',
  width: 700,
  height: 450,
  renderTo: Ext.getBody(),
  initComponent: function() {
    var me = this;
    Ext.apply(this, {
      closable: false,
      header: false,
      draggable: false,// 拖动
      resizable: false, // 变大小
      bodyCls: 'login-body',
      layout: {
        type: 'vbox',
        align: 'stretch'
      },
      items: [{
        xtype: 'component',
        html: '<div class="app-header login-header"><div class="login-header-logo"></div></div>',
        flex: 0.5
      }, {
        xtype: 'panel',
        flex: 2,
        bodyStyle: 'padding:10px 0px;',
        layout: {
          type: 'hbox',
          align: 'stretch'
        },
        items: [{
          xtype: 'component',
          html: '<div class="login"></div>',
          flex: 2
        }, {
          xtype: 'form',
          url: 'login',
          reference: 'form',
          standardSubmit: true,
          bodyStyle: 'margin: 80px 0px 0px;',
          flex: 2,
          items: [{
            xtype: 'textfield',
            name: 'username',
            bind: '{defaultUser}',
            fieldLabel: 'Username',
            allowBlank: false,
            enableKeyEvents: true,
            listeners: {
              specialKey: 'onSpecialKey'
            }
          }, {
            xtype: 'textfield',
            name: 'password',
            bind: '{defaultPwd}',
            inputType: 'password',
            fieldLabel: 'Password',
            allowBlank: false,
            enableKeyEvents: true,
            listeners: {
              specialKey: 'onSpecialKey'
            }
          }/*, {
            xtype: 'combobox',
            name: 'organization',
            fieldLabel: 'Organization',
            reference: 'organization',
            queryMode: 'local',
            editable: false,
            forceSelection: true,
            displayField: 'name',
            valueField: 'id',
            bind: {
              store: '{organizations}',
              value: {
                twoWay: false,
                bindTo: '{defaultOrg}'
              }
            }
          }*/]
        }]
      }],
      buttons: [{
        text: 'Sign in',
        scale: 'medium',
        listeners: {
          click: 'onLoginClick'
        }
      }, {
        text: 'Sign up',
        scale: 'medium',
        listeners: {
          click: 'onLoginClick'
        }
      }]
    });
    me.callParent(arguments);
  }
});
