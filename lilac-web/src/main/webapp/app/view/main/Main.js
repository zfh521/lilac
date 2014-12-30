Ext.define('Lilac.view.main.Main', {
  extend: 'Lilac.ux.view.container.Viewport',
  requires: ['Lilac.ux.TabCloseMenu', 'Lilac.view.main.Header', 'Lilac.view.main.Footer', 'Lilac.view.main.NavPanel',
      'Lilac.view.main.ContentPanel', 'Lilac.view.main.ContentController', 'Lilac.view.main.MainController',
      'Lilac.view.main.MainModel'],
  xtype: 'lilac.view.main.main',
  alias: 'widget.mainviewport',
  controller: 'lilac.view.main.maincontroller',
  reference: 'viewport',
  viewModel: {
    type: 'lilac.view.main.mainmodel'
  },
  defaults: {
    xtype: "container"
  },
  layout: {
    type: 'border'
  },
  items: [{
    xtype: 'mainheader',
    region: 'north'
  }, {
    xtype: 'lilac.view.main.footer',
    region: 'south'
  }, {
    xtype: 'lilac.view.main.navpanel',
    title: 'Navigation',
    region: 'west',
    itemId: 'navPanelId',
    width: 250,
    split: true,
    collapsible: true
  }, {
    region: 'center',
    xtype: 'lilac.view.main.contentpanel',
    reference: 'mainContentTabPanel'
  }],
  setPageTitle: function(contentTitle) {
    contentTitle = Ext.util.Format.stripTags(contentTitle);
    if (!this.origTitle) {
      this.origTitle = document.title;
    }
    document.title = contentTitle ? (contentTitle + " - " + this.origTitle) : this.origTitle
  }
});
