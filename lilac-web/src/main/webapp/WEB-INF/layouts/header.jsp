<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib prefix="lilac" uri="/WEB-INF/tlds/lilac.tld"%>
<lilac:set var="ctx" value="${pageContext.request.contextPath}" />
<shiro:user>
	<!-- topbar starts -->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand logo" href="${ctx}"></a>

				<div class="nav-collapse collapse">
					<ul class="nav">
						<li class="active"><a href="#"><i class="icon-home"></i> Home</a></li>
						<li class="divider-vertical"></li>
						<li class="divider-vertical"><a href="#"><i class="icon-file"></i> Pages</a></li>
						<li class="divider-vertical"></li>
						<li class="divider-vertical"><a href="#"><i class="icon-file"></i> Pages</a></li>
						<li class="divider-vertical"></li>
						<li><a href="#"><i class="icon-envelope"></i> Messages</a></li>
						<li class="divider-vertical"></li>
						<li class="dropdown"><a data-toggle="dropdown" class="dropdown-toggle" href="#"> <i class="icon-signal"></i>
								Stats <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li class="dropdown-submenu"><a href="#">More options</a>
									<ul class="dropdown-menu">
										<li><a href="#">Second level link</a></li>
										<li><a href="#">Second level link</a></li>
										<li><a href="#">Second level link</a></li>
										<li><a href="#">Second level link</a></li>
										<li><a href="#">Second level link</a></li>
									</ul></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li class="divider"></li>
								<li class="nav-header">Nav header</li>
								<li><a href="#">Separated link</a></li>
								<li><a href="#">One more separated link</a></li>
							</ul></li>
						<li class="divider-vertical"></li>
						<li class="dropdown"><a data-toggle="dropdown" class="dropdown-toggle" href="#"> <i class="icon-lock"></i>
								Permissions <b class="caret"></b>
						</a>
							<ul class="dropdown-menu">
								<li><a href="${ctx}/sys/objecttypes">对象设置</a></li>
								<li><a href="#">对象空间设置</a></li>
							</ul></li>
					</ul>
				</div>
				<!--/.nav-collapse -->

				<!-- theme selector starts -->
				<div class="btn-group pull-right theme-container">
					<a class="btn dropdown-toggle" data-toggle="dropdown" href="#"> <i class="icon-tint"></i><span
						class="hidden-phone"> Change Theme / Skin</span> <span class="caret"></span>
					</a>
					<ul class="dropdown-menu" id="themes">
						<li><a data-value="amelia" href="#"><i class="icon-blank"></i> Amelia</a></li>
						<li><a data-value="cerulean" href="#"><i class="icon-blank"></i> Cerulean</a></li>
						<li><a data-value="cyborg" href="#"><i class="icon-blank"></i> Cyborg</a></li>
						<li><a data-value="default" href="#"><i class="icon-blank"></i> Default</a></li>
						<li><a data-value="redy" href="#"><i class="icon-blank"></i> Redy</a></li>
						<li><a data-value="journal" href="#"><i class="icon-blank"></i> Journal</a></li>
						<li><a data-value="simplex" href="#"><i class="icon-blank"></i> Simplex</a></li>
						<li><a data-value="slate" href="#"><i class="icon-blank"></i> Slate</a></li>
						<li><a data-value="spacelab" href="#"><i class="icon-blank"></i> Spacelab</a></li>
						<li><a data-value="united" href="#"><i class="icon-blank"></i> United</a></li>
					</ul>
				</div>
				<!-- theme selector ends -->
				<!-- user dropdown starts -->
				<div class="btn-group pull-right">
					<a class="btn dropdown-toggle" data-toggle="dropdown" href="#"> <i class="icon-user"></i><span
						class="hidden-phone"> admin</span> <span class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li><a href="#">Profile</a></li>
						<li class="divider"></li>
						<li><a href="${ctx}/logout">Logout</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- topbar ends -->
</shiro:user>
<div class="container-fluid">
	<div class="row-fluid">
		<shiro:user>
			<!-- left menu starts -->
			<div class="span2 main-menu-span">
				<div class="well nav-collapse sidebar-nav">
					<ul class="nav nav-tabs nav-stacked main-menu">
						<li class="nav-header hidden-tablet">Main</li>
						<li><a class="ajax-link" href="${ctx}/charisma/index.html"><i class="icon-home"></i><span
								class="hidden-tablet"> Dashboard</span></a></li>
						<li><a class="ajax-link" href="${ctx}/charisma/ui.html"><i class="icon-eye-open"></i><span
								class="hidden-tablet"> UI Features</span></a></li>
						<li><a class="ajax-link" href="${ctx}/charisma/form.html"><i class="icon-edit"></i><span
								class="hidden-tablet"> Forms</span></a></li>
						<li><a class="ajax-link" href="${ctx}/charisma/chart.html"><i class="icon-list-alt"></i><span
								class="hidden-tablet"> Charts</span></a></li>
						<li><a class="ajax-link" href="${ctx}/charisma/typography.html"><i class="icon-font"></i><span
								class="hidden-tablet"> Typography</span></a></li>
						<li><a class="ajax-link" href="${ctx}/charisma/gallery.html"><i class="icon-picture"></i><span
								class="hidden-tablet"> Gallery</span></a></li>
						<li class="nav-header hidden-tablet">Sample Section</li>
						<li><a class="ajax-link" href="${ctx}/charisma/table.html"><i class="icon-align-justify"></i><span
								class="hidden-tablet"> Tables</span></a></li>
						<li><a class="ajax-link" href="${ctx}/charisma/calendar.html"><i class="icon-calendar"></i><span
								class="hidden-tablet"> Calendar</span></a></li>
						<li><a class="ajax-link" href="${ctx}/charisma/grid.html"><i class="icon-th"></i><span
								class="hidden-tablet"> Grid</span></a></li>
						<li><a class="ajax-link" href="${ctx}/charisma/file-manager.html"><i class="icon-folder-open"></i><span
								class="hidden-tablet"> File Manager</span></a></li>
						<li><a href="tour.html"><i class="icon-globe"></i><span class="hidden-tablet"> Tour</span></a></li>
						<li><a class="ajax-link" href="${ctx}/charisma/icon.html"><i class="icon-star"></i><span
								class="hidden-tablet"> Icons</span></a></li>
						<li><a href="${ctx}/charisma/error.html"><i class="icon-ban-circle"></i><span class="hidden-tablet">
									Error Page</span></a></li>
						<li><a href="${ctx}/charisma/login.html"><i class="icon-lock"></i><span class="hidden-tablet">
									Login Page</span></a></li>
					</ul>
					<label id="for-is-ajax" class="hidden-tablet" for="is-ajax"><input id="is-ajax" type="checkbox">
						Ajax on menu</label>
				</div>
				<!--/.well -->
			</div>
			<!--/span-->
			<!-- left menu ends -->

			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>
						You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use
						this site.
					</p>
				</div>
			</noscript>
			<div id="content" class="span10">
			<!-- content starts -->
			<div>
				<ul class="breadcrumb">
					<li><a href="#">Home</a> <span class="divider">/</span></li>
					<li><a href="#">Dashboard</a></li>
				</ul>
			</div>
		</shiro:user>