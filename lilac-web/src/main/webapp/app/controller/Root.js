/**
 * This global controller manages the login view and ensures that view is
 * created when the application is launched. Once login is complete we then
 * create the main view.
 */
Ext.define('Lilac.controller.Root', {
  extend: 'Ext.app.Controller',
  views: ['Lilac.view.main.Main'],
  loadingText: 'Loading...',
  init: function() {
  },
  onLaunch: function() {
    Ext.widget("mainviewport");
  }
});
