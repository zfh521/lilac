<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="lilac" uri="/WEB-INF/tlds/lilac.tld"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>lilac</title>
<script type="text/javascript">
	$(document).ready(function() {
		$("form").validate();
	});
</script>
</head>
<body>
	<div class="row-fluid">
		<div class="span12 center login-header">
			<h2>Welcome to Lilac</h2>
		</div>
		<!--/span-->
	</div>
	<!--/row-->
	<div class="row-fluid">
		<div class="well span5 center login-box">
			<c:if test="${shiroLoginFailure != null}">
				<div class="alert alert-error">
					<a class="close" data-dismiss="alert" href="#">×</a>
						${shiroLoginFailure.message}
				</div>
			</c:if>
			<lilac:form action="${ctx}/login" method="post" modelAttribute="usernamePasswordToken">
				<fieldset>
					<div class="input-prepend" title="Username" data-rel="tooltip">
						<span class="add-on"><i class="icon-user"></i></span>
						<lilac:input path="username" cssClass="input-large span10" value="admin" required="required" autofocus="autofocus"/>
					</div>
					<div class="clearfix"></div>
					<div class="input-prepend" title="Password" data-rel="tooltip">
						<span class="add-on"><i class="icon-lock"></i></span>
						<lilac:password path="password" cssClass="input-large span10" value="ADMIN" required="required"/>
					</div>
					<div class="clearfix"></div>
					<div class="input-prepend" title="Remember Me" data-rel="tooltip">
						<label class="checkbox" for="remember">
						<input type="checkbox" id="remember" name="rememberMe" />
						 Remember me
						</label>
					</div>
					<div class="clearfix"></div>
					<p class="center span5">
						<button type="submit" class="btn btn-primary"><lilac:message code="MSG_LOGIN" defaultMsg="登录"/></button>
					</p>
				</fieldset>
			</lilac:form>
		</div>
		<!--/span-->
	</div>
	<!--/row-->
</body>
</html>