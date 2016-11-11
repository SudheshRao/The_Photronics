<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
		<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/> 

<style> 
.color { background-color: silver;}
</style>
</head>
<body>
 <div class="footer-bottom">
        <div class="container">
            <p class="pull-left"> Copyright ©2016. All right reserved. </p>
            <div class="pull-right">
                <ul class="nav nav-pills payments">
                	<li><i class="fa fa-cc-visa fa-lg"></i></li>
                    <li><i class="fa fa-cc-mastercard fa-lg"></i></li>
                    <li><i class="fa fa-cc-amex fa-lg"></i></li>
                    <li><i class="fa fa-cc-paypal fa-lg"></i></li>
                </ul> 
            </div>
        </div>
    </div>
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>