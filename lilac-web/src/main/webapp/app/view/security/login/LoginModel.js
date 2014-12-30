/**
 * This is the View Model associated to the login view.
 */
Ext.define('Lilac.view.security.login.LoginModel', {
  extend: 'Ext.app.ViewModel',
  alias: 'viewmodel.login',
  data: {
    defaultUser: 'ADMIN',
    defaultPwd: 'ADMIN',
    defaultOrg: "org",
    username: ''
  },
  stores: {
    organizations: {
      model: 'Organization',
      autoLoad: true,
      data: PAGE_DATA,
      proxy: {
        type: 'memory',
        reader: {
          type: 'json',
          rootProperty: 'optionDataOrg'
        }
      }
    }
  }
});
