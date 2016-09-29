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
		<div class="form form-group-md">
			<form:form method="post" commandName="signupForm" >
			<form:errors path="*" cssClass="error"/>
				
				<div class="imgcontainer">
					<img style="width:150px;height:150px;" class="img-responsive center-block img-circle"src="<c:url value="/resources/images/login-image.jpg"/>" alt="login-image">
				</div>
				
				<label class="control-label" for="username">Username</label>
				<form:input path="username" id="username" class="form-control" placeholder="username"/>
				<form:errors path="username" cssClass="error"/>
				
				<label class="control-label" for="email">Email id</label>
				<form:input path="email" id="email" class="form-control" placeholder="email@domain.com"  />
				<form:errors path="email" cssClass="error"/>
				
				<label class="control-label" for="password">Password</label>
				<form:input path="password" type="password" id="password" class="form-control" placeholder="password"/>
				<form:errors path="password" cssClass="error"/>
				
				<label class="control-label" for="confirmpassword">Confirm Password</label>
				<form:input path="confirmpassword" id="confirmpassword" class="form-control" placeholder="confirm password"/>
				<form:errors path="confirmpassword" type="password" cssClass="error"/>
				
				<label class="control-label" for="address">Address</label>
				<form:input path="address" id="address" class="form-control" placeholder="address" />
				<form:errors path="address" cssClass="error"/>
				
				<button type="submit" value="Signup">Signup</button>
				
			</form:form>
		</div>
	</div>
	
	
	
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>