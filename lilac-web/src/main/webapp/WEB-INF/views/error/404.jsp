<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<%response.setStatus(200);%>
<!DOCTYPE html>
<html>
<head>
	<title>404 - 页面不存在</title>
</head>

<body>
	<div align="center" style="padding-top:60px;">
		<img src="${ctx}/static/images/404.jpg" />
		<p><a href="<c:url value="${ctx}/"/>">返回首页</a></p>
	</div>
</body>
</html>