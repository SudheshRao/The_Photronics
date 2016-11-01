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
	<link href="<c:url value="/resources/theme/css/navbarstyle.css"/>" rel="stylesheet"/>

	<style>
		.error { color:#ff0000; font-weight:bold;}
	</style>

</head>
<body>
<!-- navigation bar -->
	<nav class="navbar navbar-fixed-top nav-color">		
		<div class="container">
					
			<ul  style="text-align:center !important;"class="nav">
				<li><a id="dropbtn" href="/the_photronics">The_Photronics</a></li>
			</ul>
			
		</div>
	</nav>

<!-- form code -->
	<div class="form-horizontal">
		<div class="form form-group-md">
			<form:form method="post" commandName="signupForm" >
			<form:errors path="*" cssClass="error"/>
				
				<div class="imgcontainer">
					<img style="width:150px;height:150px;" class="img-responsive center-block img-circle"src="<c:url value="/resources/images/login-image.jpg"/>" alt="login-image">
				</div>
				<div class="row">
				<div class="col-sm-4 "><label class="control-label pull-left" for="username">Username</label></div>
				<div class="col-sm-8 "><form:input path="username" id="username" class="form-control" placeholder="your name" pattern=".{4,15}" required="true"/></div>
				<form:errors path="username" cssClass="error"/>
				</div>
				
				<div class="row">
				<div class="col-sm-4 "><label class="control-label pull-left" for="phno">phone number</label></div>
				<div class="col-sm-8 "><form:input path="phno" id="phno" class="form-control" placeholder="phone number" pattern="^\d{10}$" required="true"
			title="Please enter a valid number" /></div>
				<form:errors path="email" cssClass="error"/>
				</div>
				
				<div class="row">
				<div class="col-sm-4 "><label class="control-label pull-left" for="email">Email id</label></div>
				<div class="col-sm-8 "><form:input path="email" id="email" class="form-control" placeholder="email@domain.com" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required="true"
			title="Please enter a valid email" /></div>
				<form:errors path="email" cssClass="error"/>
				</div>
				
				<div class="row">
				<div class="col-sm-4 "><label class="control-label pull-left" for="password">Password</label></div>
				<div class="col-sm-8 "><form:input path="password" type="password" id="password" class="form-control" placeholder="keep it secret" pattern=".{8,}" required="true"/></div>
				<form:errors path="password" cssClass="error"/>
				</div>
				
				<div class="row">
				<div class="col-sm-4 "><label class="control-label pull-left" for="confirmpassword">Confirm Password</label></div>
				<div class="col-sm-8 "><form:input path="confirmpassword" type="password" id="confirmpassword" class="form-control" placeholder='"ditto"' pattern=".{8,}" required="true" title="Should match the above password"/></div>
				<form:errors path="confirmpassword" type="password" cssClass="error"/>
				</div>
				
				<div class="row">
				<div class="col-sm-4 "><label class="control-label pull-left" for="address">Address</label></div>
				<div class="col-sm-8 "><form:textarea path="address" id="address" class="form-control" placeholder="where do you live?" /></div>
				<form:errors path="address" cssClass="error"/>
				</div>
				
				<button style="margin-top:10px;" type="submit" value="Signup">Signup</button>
				
			</form:form>
		</div>
	</div>
	
	
	
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>