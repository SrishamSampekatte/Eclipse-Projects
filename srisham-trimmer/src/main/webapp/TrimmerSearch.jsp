<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"
				class="d-inline-block align-text-top"><img
				src="https://www.shopdealclue.com/image/cache/catalog/PHILIPS-BT123015-Beard-Trimmer-Trimmer-30-min--Runtime-2-Length-Settings-Green-BT123015BeardTrimmer-459-600x600.jpeg"
				alt="" height="130" width="150"> </a>
			<ul>
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="trimmerRegistration">Register</a></li>
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home Page</a></li>
			</ul>
		</div>
	</nav>
	<h1>Welcome to Trimmer Search page</h1>
	<h3>
		<span style="color: red">${message}</span>
	</h3>
	<form action="searchId" method="get">
		Search By Id<input type="text" name="id" /> <input type="submit"
			value="search" />
	</form>
	<div>
		<h4>Search Results</h4>
		ID:${dto.id}<br> 
		Company:${dto.company}<br>
		Color:${dto.color}<br>
		 Price:${dto.price}<br>
		Type:${dto.type}<br> 
		Speed:${dto.speed}
	</div>

</body>
</html>