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
<style>
h1 {
	text-align: center;
}
</style>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"
				class="d-inline-block align-text-top"><img
				src="https://www.shopdealclue.com/image/cache/catalog/PHILIPS-BT123015-Beard-Trimmer-Trimmer-30-min--Runtime-2-Length-Settings-Green-BT123015BeardTrimmer-459-600x600.jpeg"
				alt="" height="130" width="150"> </a>
			<ul>
				<li>style="display: inline-block; padding: 20px;"><a
					href="index.jsp" class="col-lg-2 col-sm-2">Home Page</a></li>
			</ul>
		</div>
	</nav>

	<h1>Welcome to Trimmer Update Form</h1>

	<c:forEach items="${errors}" var="e">
		<br>
		<span style="color: red;">${e.message}</span>
	</c:forEach>

	<form action="update" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Id</label> <input
				type="text" class="form-control" readonly="readonly" name="id"
				value="${dto.id}" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Company</label> <input
				type="text" class="form-control" name="company" id="formFile"
				required="required" placeholder="Enter company"
				value="${dto.company}" />
		</div>
		Select Color <select class="form-select"
			aria-label="Default select example" name="color" required="required">
			<option selected value="${dto.color}">${dto.color}</option>
			<c:forEach items="${colors}" var="c">
				<option value="${c}">${c}</option>
			</c:forEach>
		</select> Select Speed <select class="form-select"
			aria-label="Default select example" name="speed" required="required">
			<option selected value="${dto.speed}">${dto.speed}</option>
			<c:forEach items="${speeds}" var="s">
				<option value="${s}">${s}</option>
			</c:forEach>
		</select> Select Type <select class="form-select"
			aria-label="Default select example" name="type" required="required">
			<option selected value="${dto.type}">${dto.type}</option>
			<c:forEach items="${types}" var="t">
				<option value="${t}">${t}</option>
			</c:forEach>
		</select>
		
		<div class="mb-3">
			<label for="formFile" class="form-label">Price</label> <input
				type="number" class="form-control" name="price" id="formFile"
				required="required" placeholder="Enter price"
				value="${dto.price}" />
		</div>

		
		<input type="submit" value="Update" class="btn btn-primary" />
	</form>

</body>
</html>