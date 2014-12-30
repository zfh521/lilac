<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="lilac" uri="/WEB-INF/tlds/lilac.tld"%>
<lilac:set var="ctx" value="${pageContext.request.contextPath}" />
<jsp:include page="/WEB-INF/layouts/header.jsp">
	<jsp:param name="pageTitle" value="Login" />
</jsp:include>
<script type="text/javascript">
  var Ext = Ext || {};
  Ext.manifest = {
    "framework": "ext",
    "theme": "ext-theme-crisp",
    "js": [{
      "path": "${ctx}/assets/js/lib/ext/build/ext-all-rtl-debug.js",
      "isSdk": true
    }, {
      "path": "${ctx}/assets/js/lib/ext/build/packages/ext-theme-crisp/build/ext-theme-crisp-debug.js"
    }, {
      "path": "${ctx}/app/view/security/login/LoginApp.js"
    }],
    "css": [{
      "path": "${ctx}/assets/js/lib/ext/build/packages/ext-theme-neptune/build/resources/ext-theme-neptune-all-debug.css"
    },{
      "path": "${ctx}/assets/styles/lilac.css"
    }]
  };
  var PAGE_DATA = eval(${PAGE_DATA});
</script>
<script id="microloader" type="text/javascript" src="${ctx}/assets/js/common/bootstrap.js"></script>
</head>
<body class="login-body">
</body>
</html>