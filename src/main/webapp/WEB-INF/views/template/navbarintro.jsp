<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/> 
		<link href="<c:url value="/resources/theme/css/intro.css" />" rel="stylesheet"/>
<title>The_Photronics</title>

<style>
nav { background-color:rgba(255,255,255,1);border-radius:0px;}
div {position:relative;}
.logo {max-width:100px; max-height:150px;}
</style>

</head>
<body style="height:1500px">
	
	<div>
		<nav class="" ><div style="height:100px;"><img class="logo" src="<c:url value="/resources/images/logo.gif"/>"/></div></nav>
		
		<nav>
			<div class="container-fluid">
			
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
						
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
					
			</button>
		<div class="navbar-collapse collapse navbar-responsive-collapse ">
			
			<ul class="nav navbar-nav">
				
	<!-- drop-down for products -->
				<li><a id="dropbtn" href="/the_photronics">Home</a></li>
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
                            <li><a>Welcome: ${pageContext.request.userPrincipal.name}</a></li>
                            <li><a href="<c:url value="/j_spring_security_logout" />">Logout</a></li></c:if>
			<li class="dropdown">
				<a id="dropbtn" class="dropdown-toggle" data-toggle="dropdown" href="#">My Account<b class="caret"></b></a>
					<ul id ="dropdown-content" class="dropdown-menu">
						<li class="dropdown-submenu"><a id="dropbtn" tabindex="-1" href="viewproduct?param=guitar">Guitars and bass</a></li>
						<li class="dropdown-submenu"><a id="dropbtn" href="viewproduct?param=drums">Drums</a></li>
						<li class="dropdown-submenu"><a id="dropbtn" href="viewproduct?param=piano">Piano</a></li>							
					</ul>
			</li>

			</ul>
		</div>
 </div>
</nav>
</div>
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>