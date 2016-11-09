<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!doctype html>
<html>
<head>
	<title>Signup</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
	<link href="<c:url value="/resources/theme/css/signupcenter.css"/>" rel="stylesheet"/>

	<style>
		.error { color:#ff0000; font-weight:bold;}
	</style>

</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top ">

		
<!-- navigation bar header -->					
		<div class="navbar-header" >
					
			<a class="navbar-brand" href="/the_photronics/">The_Photronics</a>
				
		</div>	
	</div>

<!-- form code -->
	<div class="form-horizontal">
		<div class="form form-group-lg">
			<form:form action="addproduct" method="post" commandName="productForm" enctype="multipart/form-data" >
			<form:errors path="*" cssClass="error"/>
				
				
				<div class="row">
				<div class="col-sm-4"><label class="control-label pull-left" for="Instrument">Instrument</label></div>
				
				<div class="col-sm-8"><div class="row">
				<div class="col-sm-4"><form:radiobutton path="instrument" value="guitar"/>Guitar</div>
				<div class="col-sm-4"><form:radiobutton path="instrument" value="drums"/>Drums</div>
				<div class="col-sm-4"><form:radiobutton path="instrument" value="piano"/>Piano</div></div></div>
				<form:errors path="instrument" cssClass="error"/>
				</div>
				
				<div class="row">
				<div class="col-sm-4"><label class="control-label pull-left" for="company">Company</label></div>
				<div class="col-sm-8"><form:input path="company" id="company" class="form-control" placeholder="company"  /></div>
				<form:errors path="company" cssClass="error"/>
				</div>
				
				<div class="row">
				<div class="col-sm-4"><label class="control-label pull-left" for="Model">Model</label></div>
				<div class="col-sm-8"><form:input path="model" id="model" class="form-control" placeholder="model"/></div>
				<form:errors path="model" cssClass="error"/>
				</div>
				
				<div class="row">
				<div class="col-sm-4"><label class="control-label pull-left" for="Specification">Specification</label></div>
				<div class="col-sm-8"><form:textarea path="spec" id="Specification" class="form-control" placeholder="specification"/></div>
				<form:errors path="spec" cssClass="error"/>
				</div>
				
				<div class="row">
				<div class="col-sm-4"><label class="control-label pull-left" for="cost">Cost</label></div>
				<div class="col-sm-8"><form:input path="cost" id="cost" class="form-control" placeholder="cost" /></div>
				<form:errors path="cost" cssClass="error"/>
				</div>
				
				<div class="row">
				<div class="col-sm-4"><label class="control-label pull-left" for="stock">In Stock</label></div>
				<div class="col-sm-8"><form:input path="stock" id="stock" class="form-control" placeholder="In Stock" /></div>
				<form:errors path="stock" cssClass="error"/>
				</div>
				
				<form:input path="productpicture" type="file" class="form-control"/>
				
				<button type="submit" value="AddProduct">Add</button>
				
			</form:form>
		</div>
	</div>
	
	
	
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>