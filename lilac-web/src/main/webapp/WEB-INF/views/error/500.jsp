<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true"%>
<% response.setStatus(200);%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>500 - 系统内部错误</title>
</head>
<body>
	<h2>500 - 系统发生内部错误.</h2>
	<div>系统执行发生错误，信息描述如下：</div>
	<div>错误状态代码是：${pageContext.errorData.statusCode}</div>
	<div>错误发生页面是：${pageContext.errorData.requestURI}</div>
	<div>错误信息：${pageContext.exception}</div>
	<div>
		错误堆栈信息：<br />
		<c:forEach var="trace" items="${pageContext.exception.stackTrace}">
			<p>${trace}</p>
		</c:forEach>
	</div>
</body>
</html>
