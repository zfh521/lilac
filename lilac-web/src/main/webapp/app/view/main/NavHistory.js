Ext.define("Lilac.view.main.NavHistory", {
  singleton: true,
  init: function() {
    Ext.util.History.useTopWindow = false;
    Ext.util.History.init(function() {
      this.historyLoaded = true;
      this.initialNavigate()
    }, this);
    Ext.util.History.on("change", function(b) {
      this.navigate(b, true);
    }, this)
  },
  notifyTabsLoaded: function() {
    this.tabsLoaded = true;
    this.initialNavigate()
  },
  initialNavigate: function() {
    if (this.tabsLoaded && this.historyLoaded) {
      this.navigate(Ext.util.History.getToken(), true)
    }
  },
  navigate: function(e, g) {
    var f = this.parseToken(e);
    if (f.url == "#!/api") {
      Docs.App.getController("Classes").loadIndex(g)
    } else {
    }
  },
  parseToken: function(d) {
    var c = d && d.match(/!?(\/(api)(\/(.*))?)/);
    return c ? {
      type: c[2],
      url: "#!" + c[1]
    } : {};
  },
  push: function(e, f) {
    e = this.cleanUrl(e);
    if (!/^#!?/.test(e)) {
      e = "#!" + e
    }
    var d = Ext.util.History.getToken() || "";
    if ("#" + d.replace(/^%21/, "!") !== e) {
      Ext.util.History.add(e)
    }
  },
  cleanUrl: function(b) {
    return b.replace(/^[^#]*#/, "#")
  }
});