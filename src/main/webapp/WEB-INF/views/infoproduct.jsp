<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/navbar.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/>
		<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<style>
#info {margin-top:50px;}
</style>
</head>
<body>
    <!-- Page Content -->
    <div class="container">

        <!-- Portfolio Item Heading -->
        <div class="row" id="info">
            <div class="col-lg-12">
                <h1 class="page-header">${info.model}
                    <small>${info.instrument}</small>
                </h1>
            </div>
        </div>
        <!-- /.row -->

        <!-- Portfolio Item Row -->
        <div class="row">

            <div class="col-md-8">
                <img class="img-responsive center-block" src="<c:url value="/resources/images/${info.id}.jpg"/>" style="width:auto;height:auto" alt="${info.model}">
            </div>

            <div class="col-md-4">
                <h3>Instrument Description</h3>
                <p>${info.spec}</p>                
            </div>

        </div>
        <!-- /.row -->

        <!-- Related Projects Row -->
        <div class="row" style="vertical-align: middle;">

            <div class="col-lg-12">
                <h3 class="page-header">Details</h3>
            </div>

            <div class="col-sm-3 col-xs-6">
                <p>${info.company}</p>
            </div>

            <div class="col-sm-3 col-xs-6">
                <p>${info.cost}</p>
            </div>

            <div class="col-sm-3 col-xs-6">
                <p>${info.stock}</p>
            </div>

            <div class="col-sm-3 col-xs-6">
                <p><a href="#" class="btn btn-md btn-primary"><span class="fa fa-shopping-cart"></span> Add to Cart</a></p>
            </div>

        </div>
        <!-- /.row -->

        <hr>
    </div>
    <!-- /.container -->



<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>