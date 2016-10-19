<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/navbarintro.jsp"/>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"/> 
		<link href="<c:url value="/resources/theme/css/intro.css" />" rel="stylesheet"/>
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="row">

<figure class="snip1563 col-sm-4">
  <img src="<c:url value="/resources/images/14mqm9h.jpg"/>" alt="guitar" />
  <figcaption>
    <h3>Guitar</h3>
    <p>The best guitars available here. Now customizable.</p>
  </figcaption>
</figure>

<figure class="snip1563 col-sm-4">
  <img src="<c:url value="/resources/images/drums-wallpaper-modern.jpg"/>" alt="guitar" />
  <figcaption>
    <h3>Drums</h3>
    <p>Feel the beat..touching you.</p>
  </figcaption>
</figure>

<figure class="snip1563 col-sm-4">
  <img src="<c:url value="/resources/images/piano-wallpaper-hd-2454-2622-hd-wallpapers.jpg"/>" alt="guitar" />
  <figcaption>
    <h3>Piano</h3>
    <p>Feel the Grand.</p>
  </figcaption>
</figure>
</div></div>
<script src="<c:url value="/resources/bootstrap/js/jquery-3.1.0.min.js"/>"></script> 
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>