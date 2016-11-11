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
			<h2 class="container">Edit Your Shipping details</h2>                   
		</div >
	</div>
            
      

        <form:form commandName="order" class="form-horizaontal">

        <h3>Your Details</h3>

				<div class="row">
				<div class="col-sm-4 "><label class="control-label pull-left" for="username">Username</label></div>
				<div class="col-sm-8 "><form:input path="cart.customer.username" id="username" class="form-control"/></div>
				</div>
				
				<div class="row">
				<div class="col-sm-4 "><label class="control-label pull-left" for="phno">phone number</label></div>
				<div class="col-sm-8 "><form:input path="cart.customer.phno" id="phno" class="form-control"  /></div>
				</div>
				
				<div class="row">
				<div class="col-sm-4 "><label class="control-label pull-left" for="email">Email id</label></div>
				<div class="col-sm-8 "><form:input path="cart.customer.email" id="email" class="form-control"   /></div>
				</div>
				
				<div class="row">
				<div class="col-sm-4 "><label class="control-label pull-left" for="address">Address</label></div>
				<div class="col-sm-8 "><form:textarea path="cart.customer.address" id="address" class="form-control" /></div>
				</div>
       
        <input type="hidden" name="_flowExecutionKey" />

        <br><br>
        <button class="btn btn-default" name="_eventId_backToCollectCustomerInfo">Back</button>
        <input type="submit" value="Next" class="btn btn-default" name="_eventId_shippingDetailCollected" />
        <button class="btn btn-default" name="_eventId_cancel">Cancel Order</button>
        </form:form>


	
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>
