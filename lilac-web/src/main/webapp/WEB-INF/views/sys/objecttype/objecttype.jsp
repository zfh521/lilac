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
	$("form").validate({
		submitHandler: function(form){
			$.lilac.loadMask();
			form.submit();
		}
	});
});
</script>
</head>
<body>
	<div class="row-fluid sortable">
		<div class="box span12">
			<div class="box-header well" data-original-title>
				<h2>
					<i class="icon-edit"></i>
					<lilac:msg code="LBT_OBJECT_TYPE"></lilac:msg>
				</h2>
				<div class="box-icon">
					<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
				</div>
			</div>
			<div class="box-content">
				<lilac:form action="${ctx}/sys/objecttypes/" modelAttribute="objectType" cssClass="form-horizontal">
					<div class="control-group">
						<lilac:label path="objectTypeId"></lilac:label>
						<div class="controls">
							<lilac:input path="objectTypeId" required="required" />
						</div>
					</div>
					<div class="control-group">
						<lilac:label path="className" code="LBL_CLASS_NAME"></lilac:label>
						<div class="controls">
							<lilac:input path="className" required="required" />
						</div>
					</div>
					<div class="control-group">
						<lilac:label path="description" code="LBL_DESCRIPTION"></lilac:label>
						<div class="controls">
							<lilac:input path="description" />
						</div>
					</div>
					<div class="control-group">
						<lilac:label path="isDeleteState" code="LBL_IS_DELETE_STATE"></lilac:label>
						<div class="controls">
							<lilac:checkbox path="isDeleteState" />
						</div>
					</div>
					<div class="control-group">
						<lilac:label path="isLog" code="LBL_IS_LOG"></lilac:label>
						<div class="controls">
							<lilac:checkbox path="isLog" />
						</div>
					</div>
					<div class="control-group">
						<lilac:label path="isCache" code="LBL_IS_CACHE"></lilac:label>
						<div class="controls">
							<lilac:checkbox path="isCache" />
						</div>
					</div>
					<div class="form-actions">
						<button type="submit" class="btn btn-primary">Save</button>
						<button type="button" class="btn" onclick="loadMask();">Cancel</button>
					</div>
				</lilac:form>
			</div>
		</div>
		<!--/span-->
	</div>
	<!--/row-->
</body>
</html>