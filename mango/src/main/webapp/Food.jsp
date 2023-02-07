<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">


<body>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img alt=""
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				height="100px" width="100px"> </a>

			<form class="d-flex">
				<a href="index.jsp">HomePage</a>
			</form>
		</div>
	</nav>


	<form action="share" method="post">
		<div class="mb-3">
			<label for="formFile" class="food">Foodname</label> <input
				class="form-control" type="text" id="foodname" name="foodname"
				placeholder="Enter your food name">
		</div>
		Select your food type <select class="form-select"
			aria-label="Default select example" name="type">
			<option selected>Selct your type of food</option>
			<option value="Veg">Veg</option>
			<option value="Non-Veg">Non-Veg</option>
			<option value="Both">Both</option>
		</select> <label for="customRange2" class="form-label">Quantity</label> <input
			type="range" class="form-range" min="0" max="10" name="quantity"
			id="customRange2">

		<div class="mb-3">
			<label for="formFile" class="food">Price</label> <input
				class="form-control" type="text" id="foodname" name="price"
				placeholder="Enter your food Price">
		</div>
		<button type="Submit" class="btn btn-dark">Send</button>
	</form>
</body>
</html>
