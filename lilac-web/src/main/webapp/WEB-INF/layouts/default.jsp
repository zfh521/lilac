<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="lilac" uri="/WEB-INF/tlds/lilac.tld"%>
<lilac:set var="ctx" value="${pageContext.request.contextPath}" />
<lilac:set var="version" value="1.0.0"></lilac:set>
<lilac:set var="timestamp" value="<%=new Date().getTime()%>"></lilac:set>
<!DOCTYPE HTML>
<html lang="en">
<head>
<title><sitemesh:title/></title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<meta http-equiv="Cache-Control" content="no-store" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Lilac a fully featured, responsive, HTML5, Bootstrap admin template.">
<meta name="author" content="Jimmy Leung">
<link type="image/x-icon" href="${ctx}/assets/img/logo.png" rel="shortcut icon">
<link id="bs-css" href="${ctx}/assets/js/lib/bootstrap/2.3.2/css/bootstrap-default.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/assets/js/lib/bootstrap/2.3.2/css/bootstrap-responsive.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/assets/js/lib/jquery.cleditor/1.4.3/jquery.cleditor.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/assets/js/lib/jquery-ui/1.10.3/css/ui-lightness/jquery-ui.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/assets/js/lib/jquery.uniform/2.1.0/themes/default/css/uniform.default.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/assets/js/lib/jquery.chosen/0.11.1/css/chosen.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/assets/js/lib/jquery.colorbox/1.4.26/colorbox.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/assets/css/lilac.css?v=${version}" type="text/css" rel="stylesheet" />
<link href="${ctx}/assets/js/lib/jquery.fullcalendar/1.6.1/fullcalendar.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/assets/js/lib/jquery.fullcalendar/1.6.1/fullcalendar.print.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/assets/js/lib/bootstrap-modal/2.1/css/bootstrap-modal.css" type="text/css" rel="stylesheet" />
<script src="${ctx}/assets/js/lib/jquery/1.10.2/jquery.js" type="text/javascript"></script>

<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<sitemesh:head/>
</head>
<body>
<%@ include file="/WEB-INF/layouts/header.jsp"%>
			<sitemesh:body/>
	</div><!--/fluid-row-->
<%@ include file="/WEB-INF/layouts/footer.jsp"%>
</body>
<script src="${ctx}/assets/js/lib/bootstrap/2.3.2/js/bootstrap.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.validate/1.11.1/jquery.validate.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.validate/1.11.1/additional-methods.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.cookie/1.3.1/jquery.cookie.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.migrate/1.2.1/jquery-migrate.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.dataTables/1.9.4/jquery.dataTables.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.history/jquery.history.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.cleditor/1.4.3/jquery.cleditor.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery-ui/1.10.3/js/jquery-ui.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.uniform/2.1.0/jquery.uniform.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.chosen/0.11.1/chosen.jquery.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.autogrow-textarea/jquery.autogrow-textarea.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.colorbox/1.4.26/jquery.colorbox.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.fullcalendar/1.6.1/fullcalendar.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/excanvas/excanvas.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.flot/0.8.1/jquery.flot.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.flot/0.8.1/jquery.flot.pie.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.flot/0.8.1/jquery.flot.stack.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/jquery.flot/0.8.1/jquery.flot.resize.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/bootstrap-modal/2.1/js/bootstrap-modal.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/lib/bootstrap-modal/2.1/js/bootstrap-modalmanager.js" type="text/javascript"></script>
<script src="${ctx}/assets/js/common/lilac.js?v=${empty version ? timestamp :version}" type="text/javascript"></script>
<script type="text/javascript">
jQuery.extend(jQuery.validator.messages, {
	required: "<lilac:msg code='WARN_FIELD_REQUIRED' defaultMsg='This field is required.'/>",
	remote: "Please fix this field.",
	email: "Please enter a valid email address.",
	url: "Please enter a valid URL.",
	date: "Please enter a valid date.",
	dateISO: "Please enter a valid date (ISO).",
	number: "Please enter a valid number.",
	digits: "Please enter only digits.",
	creditcard: "Please enter a valid credit card number.",
	equalTo: "Please enter the same value again.",
	maxlength: $.validator.format("Please enter no more than {0} characters."),
	minlength: $.validator.format("Please enter at least {0} characters."),
	rangelength: $.validator.format("Please enter a value between {0} and {1} characters long."),
	range: $.validator.format("Please enter a value between {0} and {1}."),
	max: $.validator.format("Please enter a value less than or equal to {0}."),
	min: $.validator.format("Please enter a value greater than or equal to {0}.")
 });
</script>
</html>