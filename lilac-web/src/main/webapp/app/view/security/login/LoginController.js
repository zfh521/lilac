/**
 * This View Controller is associated with the Login view.
 */
Ext.define('Lilac.view.security.login.LoginController', {
  extend: 'Ext.app.ViewController',
  alias: 'controller.login',
  onSpecialKey: function(field, e) {
    if (e.getKey() === e.ENTER) {
      this.doLogin();
    }
  },

  onLoginClick: function() {
    this.doLogin();
  },

  doLogin: function() {
    var form = this.lookupReference('form');

    if (form.isValid()) {
      form.up("window").mask('努力为您加载中', 'loading');
      form.submit();
    }
  }
});
