<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="lilac" uri="/WEB-INF/tlds/lilac.tld"%>
<lilac:set var="ctx" value="${pageContext.request.contextPath}" />
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
	<div class="row-fluid sortable">
		<div class="box span12">
			<div class="box-header well" data-original-title>
				<h2>
					<i class="icon-edit"></i> Form Elements
				</h2>
				<div class="box-icon">
					<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
				</div>
			</div>
			<div class="box-content">
				<form class="form-horizontal" action="${ctx}/sys/objecttypes">
					<div class="span4">
						<div class="control-group">
							<label class="control-label" for="typeahead">Auto complete </label>
							<div class="controls">
								<input type="text" name="Q_EQ_.objectTypeId" class="typeahead" id="typeahead" data-provide="typeahead" data-items="4"
									data-source='["Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Dakota","North Carolina","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"]'>
							</div>
						</div>
					</div>
					<div class="span4">
						<div class="control-group">
							<label class="control-label" for="typeahead">Auto complete </label>
							<div class="controls">
								<input type="text" class="typeahead" id="typeahead" data-provide="typeahead" data-items="4"
									data-source='["Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Dakota","North Carolina","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"]'>
							</div>
						</div>
					</div>
					<div class="span4">
						<div class="span3"></div>
						<button type="submit" class="btn">
							<i class="icon-search"></i> Search
						</button>
						<a class="btn btn-primary" href="${ctx}/sys/objecttypes/new">
							<i class="icon-plus icon-white"></i> Add
						</a>
					</div>
				</form>
			</div>
		</div>
		<!--/span-->
	</div>
	<!--/row-->
	<div class="row-fluid sortable">
		<div class="box span12">
			<div class="box-header well" data-original-title>
				<h2>
					<i class="icon-user"></i> Members
				</h2>
				<div class="box-icon">
					<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
				</div>
			</div>
			<div class="box-content">
				<table class="table table-striped table-bordered bootstrap-datatable datatable">
					<thead>
						<tr>
							<th><lilac:labelDisplay code="LBL_OBJECT_TYPE_ID"/></th>
							<th><lilac:labelDisplay code="LBL_CLASS_NAME"/></th>
							<th><lilac:labelDisplay code="LBL_DESCRIPTION"/></th>
							<th><lilac:labelDisplay code="LBL_IS_DELETE_STATE"/></th>
							<th><lilac:labelDisplay code="LBL_IS_LOG"/></th>
							<th><lilac:labelDisplay code="LBL_IS_CACHE"/></th>
							<th><lilac:labelDisplay code="LBL_ACTIONS"/></th>
						</tr>
					</thead>
					<tbody>
					<lilac:forEach var="objectType" items="${objectTypePage.content}">
						<tr>
							<td>${objectType.objectTypeId}</td>
							<td>${objectType.className}</td>
							<td>${objectType.description}</td>
							<td>${objectType.isDeleteState}</td>
							<td>${objectType.isLog}</td>
							<td>${objectType.isCache}</td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
					</lilac:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<!--/span-->
	</div>
	<!--/row-->
</body>
</html>