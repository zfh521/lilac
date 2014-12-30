/**
 * The main application class. An instance of this class is created by app.js
 * when it calls Ext.application(). This is the ideal place to handle
 * application launch and initialization details.
 */
Ext.define('Lilac.Application', {
  extend: 'Ext.app.Application',
  name: 'Lilac',
  controllers: ['Lilac.controller.Root'],
  stores: []
});

Ext.application({
  name: 'Lilac',
  extend: 'Lilac.Application'
});