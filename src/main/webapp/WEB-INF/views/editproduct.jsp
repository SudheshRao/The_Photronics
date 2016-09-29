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
			<form:form action="editproduct" method="post" commandName="prod" enctype="multipart/form-data" >
			<form:errors path="*" cssClass="error"/>
				
				
				
				<label class="control-label" for="Instrument">Instrument</label>
				<form:input path="instrument" id="Instrument" class="form-control"/>
				<form:errors path="instrument" cssClass="error"/>
				
				<label class="control-label" for="company">Company</label>
				<form:input path="company" id="company" class="form-control" />
				<form:errors path="company" cssClass="error"/>
				
				<label class="control-label" for="Model">Model</label>
				<form:input path="model" id="model" class="form-control"/>
				<form:errors path="model" cssClass="error"/>
				
				<label class="control-label" for="Specification">Specification</label>
				<form:input path="spec" id="Specification" class="form-control"/>
			<form:errors path="spec" cssClass="error"/>
				
				<label class="control-label" for="cost">Cost</label>
				<form:input path="cost" id="cost" class="form-control"/>
				<form:errors path="cost" cssClass="error"/>
				
				<label class="control-label" for="stock">In Stock</label>
				<form:input path="stock" id="stock" class="form-control" />
				<form:errors path="stock" cssClass="error"/>
				
				<form:input path="productpicture" type="file" class="form-control"/>
				
				<button type="submit" value="AddProduct">Add</button>
				
			</form:form>
		</div>
	</div>
	
	
	
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>