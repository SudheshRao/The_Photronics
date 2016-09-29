<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/navbar.jsp"/>
<!DOCTYPE html>
<html>
<head>

		<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
		<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">		

<title>guitars</title>
</head>
<body style="background:rgba(240,240,240, 0.6);">
<div class="container" style="margin-top:60px;height:1000px;">
	<table class="table table-hover table-striped  table-bordered table-resposnive ">
		<tr class="text-center" style="background:rgba(0,0,0, 0.6);color:white;">
			<td>image</td>
			<td>id</td>
			<td>specification</td>
			<td>company</td>
			<td>cost</td>
			<td>instrument</td>
			<td>model</td>
			<td>In Stock</td>
			<td class="text-center">Action</td>
		</tr>
		<c:forEach items="${viewpro}" var="p">
		<tr class="text-center">
			<td><img style="width:50px;height:50px;" class="" src="<c:url value="/resources/images/${p.id}.jpg"/>" alt="productimage"/></td>
			<td>${p.id}</td>
			<td>${p.spec}</td>
			<td>${p.company}</td>
			<td>${p.cost}</td>
			<td>${p.instrument}</td>
			<td>${p.model}</td>
			<td>${p.stock}</td>
			<td class=" text-center">
			<div class="btn-group">
			<a href="editproduct/${p.id}"><span class="fa fa-pencil"></span></a>
			<a href=""><span class="fa fa-trash"></span></a>
			<a href=""><span class="fa fa-info"></span></a>
			
			</div>
			</td>

		</tr>
		</c:forEach>
</table>
</div>
</body>
</html>