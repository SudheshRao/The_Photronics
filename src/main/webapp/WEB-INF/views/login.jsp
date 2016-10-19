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

<div class="container-wrapper">
    <div class="login-container">
        <div id="login-box">

            <h2>Login with Username and Password</h2>

            <c:if test="${not empty msg}">
                <div class="msg">${msg}</div>
            </c:if>

            <form name="loginForm" action="<c:url value="/j_spring_security_check" />" method="post">
                <c:if test="${not empty error}">
                    <div class="error" style="color: #ff0000;">${error}</div>
                </c:if>
                <div class="form-group">
                    <label for="username">User: </label>
                    <input type="text" id="username" name="j_username" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="j_password" class="form-control" />
                </div>

                <input type="submit" value="Submit" class="btn btn-default">

                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            </form>

        </div>
    </div></div>
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script>
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>