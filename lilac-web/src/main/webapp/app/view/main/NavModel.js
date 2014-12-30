Ext.define('Lilac.view.main.NavModel', {
  extend: 'Ext.data.TreeModel',
  fields: [{
    name: 'title',
    depends: 'text',
    convert: function(value, record) {
      return record.get('text');
    }
  }, {
    name: 'text'
  }, {
    name: 'iconCls'
  }, {
    name: 'url'
  }, {
    name: 'leaf'
  }, {
    name: 'iframe'
  }]
});
