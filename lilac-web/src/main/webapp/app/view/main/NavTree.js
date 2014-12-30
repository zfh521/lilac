Ext.define("Lilac.view.main.NavTree", {
  extend: "Ext.tree.Panel",
  xtype: "lilac.view.main.navtree",
  rootVisible: false,
  initComponent: function() {
    var me = this;
    Ext.apply(this, {
      listeners: {
        itemclick: me.onItemClick,
        beforeitemcollapse: me.handleBeforeExpandCollapse,
        beforeitemexpand: me.handleBeforeExpandCollapse,
        urlclick: "onUrlClick"
      }
    });
    me.callParent(arguments);
  },
  onItemClick: function(view, record, item, index, e, eOpts) {
    var url = record.raw ? record.raw.url : record.data.url;
    if (url) {
      this.fireEvent("urlclick", view, record.raw, e);
    } else {
      if (!record.isLeaf()) {
        if (record.isExpanded()) {
          record.collapse(false);
        } else {
          record.expand(false);
        }
      }
    }
  },
  selectUrl: function(url) {
    var selectNode = this.findNodeByUrl(url);
    if (selectNode) {
      selectNode.bubble(function(node) {
        node.expand();
      });
      this.getSelectionModel().select(selectNode);
    } else {
      this.getSelectionModel().deselectAll();
    }
  },
  findNodeByUrl: function(url) {
    return this.getRootNode().findChildBy(function(node) {
      return url === node.raw.url;
    }, this, true);
  },
  findRecordByUrl: function(url) {
    var record = this.findNodeByUrl(url);
    return record ? node.raw : undefined;
  },
  handleBeforeExpandCollapse: function(node) {
    if (this.getView().isAnimating(node)) { return false; }
  }
});