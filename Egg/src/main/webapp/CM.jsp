<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80"> </a> <a href="index.jsp">Home
				Page</a>
		</div>
	</nav>
	<h1>Welcome to CM page</h1>
	<form action="cm" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				type="text" class="form-control" name="name" id="formFile"
				placeholder="Enter CM Name" />
		</div>
		Party <select class="form-select"
			aria-label="Default select example" name="party">
			<option selected>Select </option>
			<option value="BJP">BJP</option>
			<option value="Congress">Congress</option>
			<option value="JDS">JDS</option>
			<option value="APP">APP</option>
			<option value="KJP">KJP</option>
			
		</select>
		
		State <select class="form-select"
			aria-label="Default select example" name="state">
			<option selected>Select </option>
			<option value="KA">KA</option>
			<option value="UP">UP</option>
			<option value="AP">AP</option>
			<option value="TN">TN</option>
			
		</select>
		
		Select Tenure <select class="form-select"
			aria-label="Default select example" name="tenure">
			<option selected>Select</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="5">6</option>
		</select>
		<div class="mb-3">
			PortFolio<textarea rows="3" cols="50" name="portFolio" ></textarea> 
		</div>
		<input type="submit" value="CM" class="btn btn-primary"/>
		</form>
</html>