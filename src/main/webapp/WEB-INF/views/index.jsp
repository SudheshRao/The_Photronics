<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/navbar.jsp"/>


<!doctype html>
<html>

<head>

		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/> 
		<link href="<c:url value="/resources/theme/css/index.css" />" rel="stylesheet"/>
					
</head>

<body>
<!--

    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
--> 

	<div class="divb jumbotron container-fluid" style="margin-top:00px;height:500px;width:100%">
		
		<div class="container" style="margin-top:20px;">
			<font size="6px"><b style="color:white">The_Photronics</b></font>
			<div class="nav navbar navbar-right"><font size="6px"><i style="color:black;">Best online</i> <b style="color:rgba(230,0,0,0.9);">Music Store</b></font></div>
		</div>
		
		<div class="container" style="margin-top:20px;">
			<h1 style="color:white;">Customize your instrument</h1>
			<font class="p" size="5px" style="color:black;">Sign up into The_Photronics and send the customized details of the instruments to us.<br/></font>
			<div class="btn btn-default" style="margin:10px;"><a href="signup" ><span class="glyphicon glyphicon-user"></span> Sign Up</a></div>
		</div>
	
	</div>	

<!-- carousel starts -->
	
	<div class="diva">
		<div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="3000">
<div class="">
	<!-- Indicators -->
	
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>
		</ol>
	<!-- indicators ends -->
	<!-- Wrapper for slides -->
	
		<div class="carousel-inner" role="listbox" style="background-size:cover;">
			
			<div class="item active" id="slide1">
				<img class="img-responsive" src="<c:url value="/resources/images/bob.jpg"/>" alt="guitar"/>				
			</div>
			
			<div class="item" id="slide4">
				<img class="img-responsive" src="<c:url value="/resources/images/guitar_large.jpg"/>" alt="guitar"/>
			</div>

			<div class="item" id="slide2">
				<img class="img-responsive" src="<c:url value="/resources/images/drums_large.jpg"/>" alt="drums"/>				
			</div>

			<div class="item" id="slide3">
				<img class="img-responsive" src="<c:url value="/resources/images/piano_large.jpg"/>" alt="piano"/>				
			</div>
  
		</div><!-- slides end -->

	<!-- Left and right controls -->
	
		<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
 			<span class="icon-prev" aria-hidden="true"></span>
			<span class="sr-only">Previous</span>
		</a>
		<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
			<span class="icon-next" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
</div>
		</div><!-- carousel ends -->
	</div><!-- container-fluid ends -->
 
<!-- feature section starts -->
<div class="container">
	<div class="row" id="features">
		<div class="container">
			
			<div class=" col-sm-4 feature">
				<div class="cd panel panel-default"><div class="panel-heading"><h1 class="panel-title">Guitar</h1></div>
				<img class="img-circle" src="<c:url value="/resources/images/feature-guitar.jpg"/>" alt="guitar"/>
				<p>Direct from the factory</p>
				<a href="viewproduct?param=guitar"  class="btn btn-warning btn-block">Shop Now</a></div>
			</div>
		
			<div class="col-sm-4 feature">
				<div class="cd  panel panel-default"><div class="panel-heading"><h1 class="panel-title">Drums</h1></div>
				<img class="img-circle" src="<c:url value="/resources/images/feature-drums.jpg"/>" alt="drums"/>
				<p>Direct from the factory</p>
				<a href="viewproduct?param=drums"  class="btn btn-danger btn-block">Shop Now</a></div>		
			</div>
		
			<div class="col-sm-4 feature">
				<div class="cd panel panel-default"><div class="panel-heading"><h1 class="panel-title">Piano</h1></div>
				<img class="img-circle" src="<c:url value="/resources/images/feature-violin.jpg"/>" alt="piano"/>
				<p>Direct from the factory</p>
				<a href="viewproduct?param=piano" class="btn btn-info btn-block">Shop Now</a></div>
			</div>
		</div>
		</div><!-- container ends -->
	</div><!-- feature section ends -->

	<div class="diva jumbotron container-fluid" style="margin-top:00px;height:200px;width:100%">
		
		<div class="container" style="margin-top:20px;">
			<font size="6px">The_Photronics</font>
			<div class="nav navbar navbar-right"><font size="6px"><i style="color:black;">Best online</i> <b style="color:red;">Music Store</b></font></div>
		</div>
	</div>	
<div style="height:1000px;"></div>




<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>
