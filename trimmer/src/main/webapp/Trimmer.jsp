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
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"
				class="d-inline-block align-text-top"><img
				src="https://www.shopdealclue.com/image/cache/catalog/PHILIPS-BT123015-Beard-Trimmer-Trimmer-30-min--Runtime-2-Length-Settings-Green-BT123015BeardTrimmer-459-600x600.jpeg"
				alt="" height="130" width="150"> </a>

			<ul class="nav justify-content-end">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="index.jsp">Home Page</a></li>
				<li class="nav-item"><a class="nav-link"
					href="TrimmerSearch.jsp">Search Id</a></li>
				<li class="nav-item"><a class="nav-link"
					href="CompanySearch.jsp">Search Company</a></li>
				<li class="nav-item"><a class="nav-link" href="SearchAll.jsp">SearchAll</a></li>
				<li class="nav-item"><a class="nav-link"
					href="SerachTwoProperties.jsp">SearchByTwo</a></li>

			</ul>


		</div>
	</nav>

	<h1>Welcome to Trimmer Registration Form</h1>

	<c:forEach items="${errors}" var="e">
		<br>
		<span style="color: red;">${e.message}</span>
	</c:forEach>

	<form action="trimmer" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Company</label> <input
				type="text" class="form-control" name="company" id="formFile"
				required="required" placeholder="Enter company" value="${company}" />
		</div>
		<br> Select Color <select class="form-select"
			aria-label="Default select example" name="color" required="required">
			<option selected value="">Select Color</option>
			<c:forEach items="${colors}" var="c">
				<option value="${c}">${c}</option>
			</c:forEach>
		</select><br> Select Speed <select class="form-select"
			aria-label="Default select example" name="speed" required="required">
			<option selected value="">Select Speed</option>
			<c:forEach items="${speeds}" var="s">
				<option value="${s}">${s}</option>
			</c:forEach>
		</select> <br>Select Type <select class="form-select"
			aria-label="Default select example" name="type" required="required">
			<option selected value="">Select Type</option>
			<c:forEach items="${types}" var="t">
				<option value="${t}">${t}</option>
			</c:forEach>
		</select><br>

		<div class="mb-3">
			<label for="formFile" class="form-label">Price</label> <input
				type="number" class="form-control" name="price" id="formFile"
				required="required" placeholder="Enter Price" value="${price}" />
		</div>

		<input type="submit" value="Save" class="btn btn-primary" />
	</form>

</body>
</html>