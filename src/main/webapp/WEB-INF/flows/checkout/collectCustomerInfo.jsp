<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!doctype html>
<html>
<head>
	<title>Signup</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
</head>
<body>

	<div class="jumbotron">
		<div class="container-fluid">
			<h2 class="container">Your Shipping details</h2>                   
		</div >
	</div>
	
	<div class="container col-sm-4 col-lg-4" style="display:inline;" >
		<form:form commandName="order" class="form-horizaontal">
		
			<div class="cd panel panel-default" style="padding:10px;" >
				<h4> ${order.cart.customer.username}</h4>
				<h4><small> ${order.cart.customer.email} | ${order.cart.customer.phno}</small></h4>
				<h4><small> ${order.cart.customer.address}</small></h4>
			</div>
			
			<input type="submit" value="Edit" class="btn btn-default" name="_eventId_editCustomerInfoCollected" />
			
			<input type="hidden" name="_flowExecutionKey" />
			
        <input type="submit" value="Deliver to this address" class="btn btn-default" name="_eventId_customerInfoCollected" />
        <button class="btn btn-default" name="_eventId_cancel">Cancel Order</button>
        
			</form:form>
		
	</div>

	
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>

