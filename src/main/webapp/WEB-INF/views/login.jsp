<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!doctype html>
<html>
<head>

<title>Login</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="<c:url value="/resources/theme/css/navbarstyle.css"/>" rel="stylesheet"/>
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
	<link href="<c:url value="/resources/theme/css/logincenter.css"/>" rel="stylesheet"/>

<style>
	.error { color:#ff0000; font-weight:bold;}
	  .nav-color {color:  #fff;
     background:  rgba(255, 255, 255, 0.2);}
     .navbar-brand {color:white; text-align:center;}
     .box {color:  #fff;
     background:  rgba(255, 255, 255, 0.9);}
	 .lgnbtn { color: #4CAF50;
     background:  rgba(76, 175, 80, 0.6);}
}
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

<div class="form-horizontal">
		<div class="form form-group-md">
				
				<div class="imgcontainer">
					<img style="width:150px;height:150px;" class="img-responsive center-block img-circle"src="<c:url value="/resources/images/login-image.jpg"/>" alt="login-image">
				</div>
				
				<form name="loginForm" action="<c:url value="/j_spring_security_check" />" method="post">
                <c:if test="${not empty error}">
                    <div class="error" style="color: #ff0000;">${error}</div>
                </c:if>
                <div class="row">
				<div class="col-sm-4 "><label class="control-label pull-left" for="username">Username</label></div>
				<div class="col-sm-8 "><input type="text" id="username" name="j_username" class="form-control" placeholder="your name"/></div>
				
				</div>
				
				<div class="row">
				<div class="col-sm-4 "><label class="control-label pull-left" for="password">Password</label></div>
				<div class="col-sm-8 "><input type="password" id="password" name="j_password" class="form-control" placeholder="keep it secret"/></div>
				</div>
				<input type="submit" value="log in" class="btn btn-default">

                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            </form>
				
				</div></div>

<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script>
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>