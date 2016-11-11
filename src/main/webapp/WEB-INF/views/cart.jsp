<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cart</title>
	<meta name="viewport" content="width=device-width, initial-scale=1"/>
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
	<link rel="stylesheet" href="<c:url value="/resources/theme/css/cart.css"/>"/>
	<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">

</head>
<body>
        <div  ng-app="cartApp" ng-controller = "cartCtrl" ng-init="initCartId('${cartid}')" class="container" >
            <div class="jumbotron">
                <div class="container-fluid">
                    <h2 class="f container">Your Shopping Cart</h2>                   
                </div >
                 <div class="pull-right">
                 <a href="#" class="btn btn-danger pull-left" ng-click="clearCart('${cartid}' )">Clear Cart</a>
                 <a href="<spring:url value="/order/${cartid}"/>" class="btn btn-success pull-right">Proceed to Checkout</a>
                        </div>
</div>

	<div class="row">
		<div class="container" >
		
<div ng-repeat = "item in cart.cartItems">
	
	
  <div class="container col-sm-4 col-lg-3" >
  <div class="cd panel panel-default">
	<img class="img-responsive center-block" src="<c:url value="/resources/images/{{item.product.id}}.jpg"/>" style="width:auto;height:250px;" alt="1"/>
	<div>
		<h4 style="text-align:center;">{{item.product.company}} {{item.product.model}}</h4>
		<h4 style="text-align:center;"><small>{{item.product.instrument}}</small></h4>
		<hr/>
		<p style="text-align:center;">Manufacturer: {{item.product.company}}</p>
		<p style="text-align:center;">Price: <span class="fa fa-inr"></span>{{item.product.cost}}</p>
				
				
  				
  				<a href="#" class="btn btn-sm btn-danger center-block" ng-click="removeFromCart(item.ciid)"   style="color:ghostwhite;">
  				<span class="glyphicon glyphicon-trash"></span> Remove</a>  				
		</div></div></div>
	
	</div>
	</div>
</div></div>
<!-- Modal -->
				<div id="myModal" class="modal fade">
  					<div class="modal-dialog">

    					<!-- Modal content-->
    					<div class="modal-content">
      						<div class="modal-header">
      							<button type="button" class="close" data-dismiss="modal">&times;</button>
        						<h4 class="modal-title">Remove</h4>
      						</div>
      						<div class="modal-body">
        						<p>Are you sure you want to remove this item from cart?</p>
      						</div>
      						<div class="modal-footer">
        						<a class="btn btn-danger" href="deleteproduct/${c.id}"><span class="fa fa-check"></span> Yes</a>
        						<a class="btn btn-success" data-dismiss="modal"><span class="fa fa-times"></span> No</a>
      						</div>
    					</div>

  					</div>
				</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"/>
    
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>
<script src="<c:url value="/resources/theme/js/ajsc.js" /> "></script>
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>