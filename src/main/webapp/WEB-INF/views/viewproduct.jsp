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
			<a href="editproduct/${p.id}"><span class="glyphicon glyphicon-pencil"></span></a>
			<a  data-toggle="modal" href="#myModal"><span class="glyphicon glyphicon-trash"></span></a>
			
			<div id="myModal" class="modal fade">
			<div class="modal-dialog">
<!-- Modal content-->
		<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">&times;</button>
			<h4 class="modal-title">Delete</h4>
		</div>
		
		<div class="modal-body">
			<p>Are you sure you want to delete this item?</p>
		</div>
		
		<div class="modal-footer">
			<a class="btn btn-danger" href="deleteproduct/${p.id}"><span class="fa fa-check"></span> Yes</a>
			<a class="btn btn-success" data-dismiss="modal"><span class="fa fa-times"></span> No</a>
		</div>
		
		</div>
		</div>
		</div>
 
			
			<a href="infoproduct/${p.id}"><span class="glyphicon glyphicon-info-sign"></span></a>
			
			</div>
			
			</td>

		</tr>
		</c:forEach>
</table>
</div>



<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>