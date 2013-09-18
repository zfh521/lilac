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
				<form class="form-horizontal" action="${ctx}/sys/objectType">
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
							<th>Username</th>
							<th>Date registered</th>
							<th>Role</th>
							<th>Status</th>
							<th>Actions</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>David R</td>
							<td class="center">2012/01/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-success">Active</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Chris Jack</td>
							<td class="center">2012/01/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-success">Active</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Jack Chris</td>
							<td class="center">2012/01/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-success">Active</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Muhammad Usman</td>
							<td class="center">2012/01/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-success">Active</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Sheikh Heera</td>
							<td class="center">2012/02/01</td>
							<td class="center">Staff</td>
							<td class="center"><span class="label label-important">Banned</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Helen Garner</td>
							<td class="center">2012/02/01</td>
							<td class="center">Staff</td>
							<td class="center"><span class="label label-important">Banned</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Saruar Ahmed</td>
							<td class="center">2012/03/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-warning">Pending</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Ahemd Saruar</td>
							<td class="center">2012/03/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-warning">Pending</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Habib Rizwan</td>
							<td class="center">2012/01/21</td>
							<td class="center">Staff</td>
							<td class="center"><span class="label label-success">Active</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Rizwan Habib</td>
							<td class="center">2012/01/21</td>
							<td class="center">Staff</td>
							<td class="center"><span class="label label-success">Active</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Amrin Sana</td>
							<td class="center">2012/08/23</td>
							<td class="center">Staff</td>
							<td class="center"><span class="label label-important">Banned</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Sana Amrin</td>
							<td class="center">2012/08/23</td>
							<td class="center">Staff</td>
							<td class="center"><span class="label label-important">Banned</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Ifrah Jannat</td>
							<td class="center">2012/06/01</td>
							<td class="center">Admin</td>
							<td class="center"><span class="label">Inactive</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Jannat Ifrah</td>
							<td class="center">2012/06/01</td>
							<td class="center">Admin</td>
							<td class="center"><span class="label">Inactive</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Robert</td>
							<td class="center">2012/03/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-warning">Pending</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Dave Robert</td>
							<td class="center">2012/03/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-warning">Pending</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Brown Robert</td>
							<td class="center">2012/03/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-warning">Pending</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Usman Muhammad</td>
							<td class="center">2012/01/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-success">Active</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Abdullah</td>
							<td class="center">2012/02/01</td>
							<td class="center">Staff</td>
							<td class="center"><span class="label label-important">Banned</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Dow John</td>
							<td class="center">2012/02/01</td>
							<td class="center">Admin</td>
							<td class="center"><span class="label">Inactive</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>John R</td>
							<td class="center">2012/02/01</td>
							<td class="center">Admin</td>
							<td class="center"><span class="label">Inactive</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Paul Wilson</td>
							<td class="center">2012/03/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-warning">Pending</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Wilson Paul</td>
							<td class="center">2012/03/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-warning">Pending</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Heera Sheikh</td>
							<td class="center">2012/01/21</td>
							<td class="center">Staff</td>
							<td class="center"><span class="label label-success">Active</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Sheikh Heera</td>
							<td class="center">2012/01/21</td>
							<td class="center">Staff</td>
							<td class="center"><span class="label label-success">Active</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Christopher</td>
							<td class="center">2012/08/23</td>
							<td class="center">Staff</td>
							<td class="center"><span class="label label-important">Banned</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Andro Christopher</td>
							<td class="center">2012/08/23</td>
							<td class="center">Staff</td>
							<td class="center"><span class="label label-important">Banned</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Jhon Doe</td>
							<td class="center">2012/06/01</td>
							<td class="center">Admin</td>
							<td class="center"><span class="label">Inactive</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Lorem Ipsum</td>
							<td class="center">2012/03/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-warning">Pending</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Abraham</td>
							<td class="center">2012/03/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-warning">Pending</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Brown Blue</td>
							<td class="center">2012/03/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-warning">Pending</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
						<tr>
							<td>Worth Name</td>
							<td class="center">2012/03/01</td>
							<td class="center">Member</td>
							<td class="center"><span class="label label-warning">Pending</span></td>
							<td class="center"><a class="btn btn-success" href="#"> <i class="icon-zoom-in icon-white"></i> View
							</a> <a class="btn btn-info" href="#"> <i class="icon-edit icon-white"></i> Edit
							</a> <a class="btn btn-danger" href="#"> <i class="icon-trash icon-white"></i> Delete
							</a></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<!--/span-->
	</div>
	<!--/row-->
</body>
</html>