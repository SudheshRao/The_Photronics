<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		
	
<!-- navigation bar code starts -->
	<nav class="navbar navbar-fixed-top navbar-inverse">
			
		<div class="container">
			
<!-- collapse code -->
		<div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/the_photronics">The_Photronics</a>
        </div>
  
<!-- items in navigation bar -->    
		<div class="collapse navbar-collapse" id="navbar-collapse">
			
			<ul class="nav navbar-nav navbar-right">
				
	<!-- drop-down for products -->
				
				<li class="dropdown">
					<a id="dropbtn" class="dropdown-toggle" data-toggle="dropdown" href="#">Instruments <b class="caret"></b></a>
						<ul id ="dropdown-content" class="dropdown-menu">
							<li class="dropdown-submenu"><a tabindex="-1" href="product">Guitars and bass</a>
							
								<ul class="dropdown-menu" >
									<li><a tabindex="1" href="#">Electric</a></li>
									<li><a href="#">Acoustic</a></li>
									<li><a href="#">Classic</a></li>
									<li><a href="#">Basses</a></li>
								</ul></li>
								
							<li class="dropdown-submenu"><a href="#">Drums</a>
								<ul class="dropdown-menu" >
									<li><a tabindex="1" href="#">Drum sets</a></li>
									<li><a href="#">Digital</a></li>
								</ul></li>
							<li class="dropdown-submenu"><a href="#">Piano</a>
								<ul class="dropdown-menu" >
									<li><a tabindex="1" href="#">Acoustic</a></li>
									<li><a href="#">Digital</a></li>
								</ul></li>
							
						</ul>
				</li>

				<li><a href="addproduct"><span class="glyphicon glyphicon-log-in"></span>  Add Product</a></li>
				<li><a href="signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="login"><span class="glyphicon glyphicon-log-in"></span>  Login</a></li>
				<li>
              <a class="btn btn-default collapsed"  data-toggle="collapse" href="#nav-collapse" aria-expanded="false" aria-controls="nav-collapse3">
              <span class="glyphicon glyphicon-search"></span>
              </a>
            </li>
			</ul>
			
			
			<div class="collapse nav navbar-nav nav-collapse slide-down" id="nav-collapse">
            <form class="navbar-form navbar-right" role="search">
              <div class="form-group">
                <div  id="searchsize"  class="input-group">
							<input type="Search" placeholder="Search..." class="form-control"  />
							<div class="input-group-btn">
							<button class="btn btn-default" type="button"><span class="glyphicon glyphicon-search"></span></button>
							</div></div></div>
            </form>
          </div>
		</div><!-- end of items in navigation bar -->
 
</div>

	</nav><!-- end of navigation bar -->

	<!-- search tab -->
	<!--			
				<li >
					<form action="" class="navbar-form navbar-left ">
					    
						<div  id="searchsize"  class="input-group">
							<input type="Search" placeholder="Search..." class="form-control"  />
							<div class="input-group-btn">
							<button class="btn btn-default" type="button"><span class="glyphicon glyphicon-search"></span></button>
							</div>
						</div>
						
					</form>
				</li>-->
				
<!-- form code -->
	<div class="form-horizontal">
		<div class="form form-group-md">
			<form:form method="post" commandName="loginForm">
			<form:errors path="*" cssClass="error"/>
			
				<div class="imgcontainer">
					<img class="img-responsive imgt center-block img-circle"src="<c:url value="/resources/images/asfalt-light.png"/>" alt="login-image">
				</div>
				
				<form:input path="username" class="form-control" type="text" placeholder="username"/>
				<form:errors path="username" cssClass="error"/>
				
				
				<form:input path="password" class="form-control" type="password" placeholder="password"/>
				<form:errors path="password" cssClass="error"/>
				
				<div  class="lgnbtn"><button><font size="4" style="color:white;"><b>login</b></font></button></div>
				<div class="box"><p class="message">Not registered? <a href="signup"><b>Sign up</b></a></p></div>
				
			</form:form>
		</div>
	</div>

<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script>
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>