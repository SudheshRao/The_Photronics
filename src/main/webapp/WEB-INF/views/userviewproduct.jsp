<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/navbar.jsp"/>
<!DOCTYPE html >
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
		<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
		
		<title>products</title>
		<style>body {background-color:#212121 !important}
#menu {min-width:50px !important;}
.item {
  position: relative;
  overflow: hidden;
}
.item img {
  max-width: 100%;
  
  -moz-transition: all 0.3s;
  -webkit-transition: all 0.3s;
  transition: all 0.3s;
}
.item:hover img {
  -moz-transform: scale(1.1);
  -webkit-transform: scale(1.1);
  transform: scale(1.1);
}
		 
		.cd {
         -webkit-transition: all 200ms ease-in;

    -ms-transition: all 200ms ease-in;

    -moz-transition: all 200ms ease-in;

    transition: all 200ms ease-in;
 
  overflow: hidden;
}

.cd:hover {      
  -moz-transform: scale(1.1);
  -webkit-transform: scale(1.1);
  transform: scale(1.1); 
}
		</style>
</head>

<div style="min-height:60px;"></div> 
	<div ng-app="cartApp">
	<c:forEach items="${viewpro}" var="p">

		<div class="container col-sm-6 col-md-6 col-lg-6" style="background:white;border:10px solid #212121;">
			<div class="row"><div>
			<div onclick="location.href='infoproduct/${p.id}';"style="cursor: pointer;text-decoration:none; color:black;">
				<div class="item col-sm-6"><img style="width:auto;height:250px;" class="center-block" src="<c:url value="/resources/images/${p.id}.jpg"/>" alt="productimage"/></div>
				<div class="cd col-sm-6" >
					<h3 style="margin-bottom:0px;text-align:center;">${p.company} ${p.model}</h3>
					<p style="text-align:center;"><small>by ${p.company}</small></p>
					<p style="margin-top:20px;text-align:left;">Instrument: ${p.instrument}</p>
					<p style="text-align:left;color:red;"><b>${p.cost}</b></p>
					<p style="text-align:left;">In Stock: ${p.stock}</p></div></div>
					<div ng-controller="cartCtrl">
						<a class="cd btn btn-primary " href="#" ng-click="addToCart('${p.id}')">
						<span class="glyphicon glyphicon-shopping-cart"></span> Add to Cart</a>
					</div>
					<c:if test="${pageContext.request.userPrincipal.name == 'admin'}">
					<a href="editproduct/${p.id}"><span class="glyphicon glyphicon-pencil"></span></a></c:if>
				<c:if test="${pageContext.request.userPrincipal.name == 'admin'}">
				<div class = "btn-group" >
				 <a class="dropdown-toggle btn-xs" data-toggle = "dropdown">
<span class="glyphicon glyphicon-trash"></span>
   </a>
				
   <ul class = "dropdown-menu " id= "menu">
      <li class="dropdown-header" >Sure?</li>
      <li><a href="deleteproduct/${p.id}">Yes</a></li>
      <li><a href = "#">No</a></li>

   </ul>
   
</div>
		</c:if></div></div></div>

				
			
		
		
	</c:forEach></div>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="<c:url value="/resources/theme/js/ajsc.js" /> "></script>	
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>	
</body>
</html>