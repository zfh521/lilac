Ext.define("Lilac.config.Setting", {
  fields: ["id", "key", "value"],
  extend: "Ext.data.Model",
  requires: ["Ext.data.proxy.LocalStorage"],
  proxy: {
    type: window.localStorage ? "localstorage" : "memory",
    id: "lilac-settings"
  }
});
Ext.define("Lilac.store.Settings", {
  extend: "Ext.data.Store",
  requires: ["Lilac.config.Setting"],
  model: "Lilac.config.Setting"
});
Ext.define("Lilac.LocalStore", {
  storeName: "",
  init: function() {
    this.localStorage = !!window.localStorage;
    this.store = Ext.create(this.storeName);
    if (this.localStorage) {
      this.cleanup();
      this.store.load();
      if (window.addEventListener) {
        window.addEventListener("storage", Ext.Function.bind(this.onStorageChange, this), false)
      } else {
        window.attachEvent("onstorage", Ext.Function.bind(this.onStorageChange, this))
      }
    }
  },
  onStorageChange: function(b) {
    b = b || window.event;
    if (b.key === this.store.getProxy().id) {
      this.store.load()
    }
  },
  syncStore: function() {
    this.localStorage && this.store.sync()
  },
  cleanup: function() {
    var f = /-settings/;
    for (var d = 0; d < window.localStorage.length; d++) {
      var e = window.localStorage.key(d);
      if (!f.test(e)) {
        window.localStorage.removeItem(e)
      }
    }
  }
});
Ext.define("Lilac.Settings", {
  extend: "Lilac.LocalStore",
  singleton: true,
  requires: "Lilac.store.Settings",
  storeName: "Lilac.store.Settings",
  defaults: {
    show: {
      "public": true,
      "protected": false,
      "private": false,
      deprecated: false,
      removed: false,
      inherited: true,
      accessor: true
    },
    comments: {
      hideRead: false
    },
    showPrivateClasses: false,
    classTreeLogic: "PackageLogic"
  },
  set: function(d, f) {
    var e = this.store.findExact("key", d);
    if (e > -1) {
      this.store.removeAt(e)
    }
    this.store.add({
      key: d,
      value: f
    });
    this.syncStore()
  },
  get: function(c) {
    var d = this.store.findExact("key", c);
    return d > -1 ? this.store.getAt(d).get("value") : this.defaults[c]
  }
});