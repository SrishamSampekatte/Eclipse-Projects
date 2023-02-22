<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
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
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80"> </a> <a href="index.jsp">Home
				Page</a>
		</div>
	</nav>
	<h1>Welcome to Big basket saving....</h1>
	<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message}</span>
		</br>
	</c:forEach>

	<form action="bigbasket" method="post">

		<div class="mb-3">
			<label for="formFile" class="form-label"> Name</label> <input
				type="text" class="form-control" name="name" id="formFile"
				placeholder="Enter your Name" />
		</div>

		<div class="mb-3">
			<label for="formFile" class="form-label"> Email</label> <input
				type="email" class="form-control" name="email" id="formFile"
				placeholder="Enter your email" />
		</div>

		<div class="mb-3">
			Phone Number<label for="formFile" class="form-label"> Phone
				Number</label> <input type="text" class="form-control" name="phoneNumber"
				id="formFile" placeholder="Enter your Phone Number" />
		</div>

		<div class="mb-3">
			Password<label for="formFile" class="form-label"> Password</label> <input
				type="password" class="form-control" name="password" id="formFile"
				placeholder="Enter password" />
		</div>

		Select Items <select class="form-select"
			aria-label="Default select example" name="item">
			<option value="">Select items</option>
			<c:forEach items="${items}" var="i">
				<option value="${i}">${i}</option>
			</c:forEach>
		</select>

		<div class="mb-3">
			<label for="formFile" class="form-label"> Price</label> <input
				type="text" class="form-control" name="price" id="formFile"
				placeholder="Enter price" />
		</div>

		<div class="mb-3">
			<label for="formFile" class="form-label"> Color</label> <input
				type="text" class="form-control" name="color" id="formFile"
				placeholder="Enter colour" />
		</div>

		<div class="mb-3">
			<label for="formFile" class="form-label">Quantity</label> <input
				type="text" class="form-control" name="quantity" id="formFile"
				placeholder="Enter qunatity" />
		</div>
		<div>
			Select Area <select class="form-select"
				aria-label="Default select example" name="area">
				<option value="">Select area</option>
				<c:forEach items="${areas}" var="a">
					<option value="${a}">${a}</option>
				</c:forEach>
			</select>
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label"> Payment Mode</label> <input
				type="text" class="form-control" name="pay" id="formFile"
				placeholder="Enter your payment Mode" />
		</div>


		</select> <input type="submit" value="Save" class="btn btn-primary" />

	</form>


</body>
</html>