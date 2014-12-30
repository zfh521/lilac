Ext.define('Lilac.ux.app.ViewController', {
  extend: 'Ext.app.ViewController',
  getBaseUrl: function() {
    return document.location.href.replace(/\/?(index.html|template.html)?(\?[^#]*)?#.*/, "")
  }
});