Ext.tip.QuickTipManager.init();
Ext.define('Lilac.Application', {
  extend: 'Ext.app.Application',
  name: 'Lilac',
  views: ['Lilac.view.security.login.Login'],
  stores: [],
  launch: function() {
    if (Ext.isIE8) {
      Ext.Msg.alert('Not Supported',
              'This example is not supported on Internet Explorer 8. Please use a different browser.');
      return;
    }

    this.session = new Ext.data.Session({
      autoDestroy: false
    });

    this.login = new Lilac.view.security.login.Login({
      session: this.session,
      autoShow: true
    });
  }
});

/**
 * Login application
 */
Ext.application({
  name: 'Lilac',
  extend: 'Lilac.Application'
});
