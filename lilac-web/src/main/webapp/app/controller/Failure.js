Ext.define("Lilac.controller.Failure", {
  extend: "Ext.app.Controller",
  baseUrl: "#",
  refs: [{
    ref: "viewport",
    selector: "#viewport"
  }, {
    ref: "index",
    selector: "#failure"
  }],
  show404: function(msg) {
    var tpl = new Ext.XTemplate("<h1>Oops...</h1>", "<p>{msg}</p>");
    Ext.getCmp("failure").update(tpl.apply({
      msg: msg
    }));
  }
});