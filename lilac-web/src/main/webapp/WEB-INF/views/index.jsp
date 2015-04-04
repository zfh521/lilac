<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="lilac" uri="/WEB-INF/tlds/lilac.tld"%>
<lilac:set var="ctx" value="${pageContext.request.contextPath}" />
<jsp:include page="/WEB-INF/layouts/header.jsp">
	<jsp:param name="pageTitle" value="Lilac framework" />
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
      "path": "${ctx}/assets/js/lib/ext/build/packages/sencha-charts/build/sencha-charts-debug.js"
    }, {
      "path": "${ctx}/app/view/main/MainApp.js"
    }],
    "css": [
        {
          "path": "${ctx}/assets/js/lib/ext/build/packages/ext-theme-neptune/build/resources/ext-theme-neptune-all-debug.css"
        },
        {
          "path": "${ctx}/assets/js/lib/ext/build/packages/sencha-charts/build/neptune/resources/sencha-charts-all-debug.css"
        }, {
          "path": "${ctx}/assets/styles/lilac.css"
        }]
  };
</script>
<script id="microloader" type="text/javascript" src="${ctx}/assets/js/common/bootstrap.js"></script>
</head>
<body>
	<div id="footer">
		<div class="copyright">Copyright © Andy Liang, All Rights Reserved</div>
		<div class="user-info">
			User id:
			<lilac:user>
				<lilac:principal property="userId"></lilac:principal>
			</lilac:user>
		</div>
	</div>
</body>
</html>