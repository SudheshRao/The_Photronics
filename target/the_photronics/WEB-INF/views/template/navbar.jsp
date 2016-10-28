<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
 <html>

<head>
    
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="<c:url value="/resources/theme/css/navbarstyle.css"/>" rel="stylesheet"/>
	<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
		
	<title>The_Photronics</title>

</head>

<body >
	
<!-- navigation bar code starts -->
	
	<nav class="navbar navbar-fixed-top nav-color">
			
		<div class="container-fluid">
			
<!-- collapse code -->
		<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
						
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
					
		</button>

<!-- navigation bar header -->					
		
		<div class="navbar-header ">
					
			<!--<a class="navbar-brand " href="/the_photronics/"><img class="logo" src="<c:url value="/resources/images/logo.gif"/>"/></a>-->
				
		</div>
  
<!-- items in navigation bar -->    
		
		<div class="navbar-collapse collapse navbar-responsive-collapse ">
			
			<ul class="nav navbar-nav">
				
	<!-- drop-down for products -->
				<li><a id="dropbtn" href="/the_photronics">The_Photronics</a></li>
				<li class="dropdown">
					<a id="dropbtn" class="dropdown-toggle" data-toggle="dropdown" href="#">Instruments <b class="caret"></b></a>
						<ul id ="dropdown-content" class="dropdown-menu">
							<li class="dropdown-submenu"><a id="dropbtn" tabindex="-1" href="viewproduct?param=guitar">Guitars and bass</a>
							
								<ul class="dropdown-menu"  >
									<li><a id="dropbtn" tabindex="1" href="#">Electric</a></li>
									<li><a id="dropbtn" href="#">Acoustic</a></li>
									<li><a id="dropbtn" href="#">Classic</a></li>
									<li><a id="dropbtn" href="#">Basses</a></li>
								</ul></li>
								
							<li class="dropdown-submenu"><a id="dropbtn" href="viewproduct?param=drums">Drums</a>
								<ul class="dropdown-menu" >
									<li><a id="dropbtn" tabindex="1" href="#">Drum sets</a></li>
									<li><a id="dropbtn" href="#">Digital</a></li>
								</ul></li>
							<li class="dropdown-submenu"><a id="dropbtn" href="viewproduct?param=piano">Piano</a>
								<ul class="dropdown-menu" >
									<li><a id="dropbtn" tabindex="1" href="#">Acoustic</a></li>
									<li><a id="dropbtn" href="#">Digital</a></li>
								</ul></li>
							
						</ul>
				</li>
				
	<!-- search tab -->
				
				<li>
					<form action="viewproduct" class="navbar-form navbar-left ">
					    
						<div  id="searchsize"  class="input-group">
							<input type="Search" placeholder="Search..." class="form-control"  />
							<div class="input-group-btn">
							<button class="btn btn-default" type="button"><span class="glyphicon glyphicon-search"></span></button>
							</div>
						</div>
						
					</form>
				</li>
				
			</ul>
			
	<!-- sign up & login item -->

			<ul class="nav navbar-nav navbar-right" >
			<c:if test="${pageContext.request.userPrincipal.name != null}">
                            <c:if test="${pageContext.request.userPrincipal.name != 'admin'}">
                                <li><a id="dropbtn" href="<c:url value="/cart" />">Cart</a></li>
                            </c:if>
                            <li class="dropdown">
				<a id="dropbtn" class="dropdown-toggle" data-toggle="dropdown" href="#">My Account<b class="caret"></b></a>
					<ul id ="dropdown-content" class="dropdown-menu">
						<li><a id="dropbtn" tabindex="-1" href="">${pageContext.request.userPrincipal.name}</a></li>
						<li><a id="dropbtn" href="">Drums</a></li>
						<li><a id="dropbtn" href="<c:url value="/j_spring_security_logout" />">Logout</a></li>							
					</ul>
			</li>
                            </c:if>
                            <c:if test="${pageContext.request.userPrincipal.name == 'admin'}">
			<li><a id="dropbtn" href="addproduct"><span class="glyphicon glyphicon-log-in"></span>  Add Product</a></li></c:if>
			<c:if test="${pageContext.request.userPrincipal.name == null}">
				<li><a id="dropbtn" href="signup" ><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a id="dropbtn" href="login"><span class="glyphicon glyphicon-log-in"></span>  Login</a></li></c:if>
			</ul>
			
		</div><!-- end of items in navigation bar -->
 
		</div><!-- end of container -->

	</nav><!-- end of navigation bar -->


<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>