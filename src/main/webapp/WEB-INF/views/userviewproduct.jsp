<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/navbarintro.jsp"/>
<!DOCTYPE html >
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
		<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
		<title>products</title>
		<style>body {background-color:#212121 !important}</style>
</head>
<body>

	<c:forEach items="${viewpro}" var="p">

	
		<div class="container col-sm-5 " style="background:white;margin:5px; margin-top:25px;">
			<div class="row">
				<div class="col-sm-6"><img style="width:250px;height:250px;" class="" src="<c:url value="/resources/images/${p.id}.jpg"/>" alt="productimage"/></div>
				<div class="col-sm-6" style="text-align:left;">
					<h3 style="margin-bottom:0px;">${p.company} ${p.model}</h3>
					<small >by ${p.company}</small>
					<p style="margin-top:20px;">Instrument: ${p.instrument}</p>
					<p>${p.cost}</p>
					<p>In Stock: ${p.stock}</p>
					<p><a href="#" class="btn btn-md btn-primary"><span class="fa fa-shopping-cart"></span> Add to Cart</a></p>
				</div>
			</div>
		</div>
		
	</c:forEach>
	
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>	
</body>
</html>