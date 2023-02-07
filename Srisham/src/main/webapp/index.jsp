<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img alt=""
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				height="100px" width="100px"> </a>
		</div>
	</nav>
	<h1>Welcome to Srisham</h1>
	<form action="email">
		<h3>Display Email : ${myemail}</h3>
		<input type="submit" value="Email" />
	</form>
	<br>
	<form action="mobile">
		<h3>Display Mobile : ${myMobile}</h3>
		<input type="submit" value="Mobile" />
	</form>
	<br>
	<form action="adhar">
		<h3>Display Adhar : ${myAdhar}</h3>
		<input type="submit" value="Adhar" />
	</form>
	<br>
	<form action="age">
		<h3>Display Age : ${myAge}</h3>
		<input type="submit" value="Age" />
	</form>
	<br>
	<form action="dob">
		<h3>Display Date of Birth : ${myBirth}</h3>
		<input type="submit" value="DOB" />
	</form>
	<br>
	<form action="salery">
		<h3>Display Date of Salery : ${mySalary}</h3>
		<input type="submit" value="Salary" />
	</form>
	<br>
	<form action="bestFriends">
		<h3>Display Friends</h3>
		<input type="submit" value="Friends" />
		<ul>
			<c:forEach items="${priends}" var="item">
				<li>${item}</li>
			</c:forEach>
		</ul>
	</form>
	<br>
	<form action="visitedPlaces">
		<h3>Display Places</h3>
		<input type="submit" value="Places" />
		<ul>
			<c:forEach items="${places}" var="item">
				<li>${item}</li>
			</c:forEach>
		</ul>
	</form>
	<br>
	<form action="skillSet">
		<h3>Display Skill Sets</h3>
		<input type="submit" value="Skill" />
		<ul>
			<c:forEach items="${skills}" var="item">
				<li>${item}</li>
			</c:forEach>
		</ul>
	</form>
	<br>
	<form action="edu">
		<h3>Display Education</h3>
		<input type="submit" value="Education" /> <br> <label>anganvadi:${education.anganvadi}</label>
		</br> <label>primary:${education.primary}</label> </br> <label>
			secondary:${education.secondary}</label></br> <label>
			degree:${education.degree}</label></br> <label>university:${education.university}</label></br>
		<label> anganvadiPercentage:${education.anganvadiPercentage}</label></br> <label>primaryPercentage:${education.primaryPercentage}</label></br>
		<label>secondaryPercentage:${education.secondaryPercentage}</label></br> <label>
			degreePercentage:${education.degreePercentage}</label></br> <label>
			universityPercentage:${education.universityPercentage}</label></br>
	</form>
	<br>
	<form action="family">
		<h3>Display Family</h3>
		<input type="submit" value="Family" /> <br> <label>familyName:${family.familyName}</label>
		</br> <label>location:${family.location}</label></br> <label>
			grandFather:${family.grandFather}</label></br> <label>grandMother:${family.grandMother}</label></br>
		<label>fatheName:${family.fatheName}</label></br> <label>motherName:${family.motherName}</label></br>
		<label>famMembers:${family.famMembers}</label></br> <label>noOfSiblings:${family.noOfSiblings}</label></br>
		<label>fatherProfession:${family.fatherProfession}</label></br> <label>jointFamily:${family.jointFamily}</label></br>
	</form>
	<br>
	<form action="mobilePhone">
		<h3>Display Mobile</h3>
		<input type="submit" value="Mobile" /> <br> <label>
			Mobile Brand:${mobile.brand}</label></br> <label> Mobile
			Model:${mobile.model}</label></br> <label> Mobile Color:${mobile.color}</label></br> <label>
			Mobile Operating System:${mobile.operatingSystem}</label></br> <label>
			Mobile Price:${mobile.price}</label></br>
	</form>
	<br>
	<form action="masala ">
		<h3>Display ChatDTO</h3>
		<input type="submit" value="show chat" /><br>
		<lable>Name:${spicy.chatName}</lable>
		<br>
		<lable>Price:${spicy.chatPrice}</lable>
		<br>
		<lable>Plates:${spicy.noOfPlates}</lable>
		<br>
		<lable>Owner Name:${spicy.ownerName}</lable>
		<br>
		<lable>Id:${spicy.id}</lable>
		<br>
		<lable>Shop name:${spicy.chatShopName}</lable>
		<br>
		<lable>Shop phone :${spicy.chatShopPH}</lable>
		<br>
		<lable>No of Employee:${spicy.noOfEmployee}</lable>
		<br>
		<lable>GST:${spicy.chatGSTNo}</lable>
		<br>
		<lable>Location:${spicy.chatShopLocation}</lable>
	</form>
	<br>
	<form action="beverage">
		<H3>Display BeverageDTO</H3>
		<input type="submit" value="Beverages" /><br>
		<lable>BeverageDTO:${ juice.getBeverageName()}</lable>
		<br>
		<lable>BeverageDTO:${ juice.getNoOfbeverage()}</lable>
		<br>
		<lable>BeverageDTO:${ juice.getBeveragePrice()}</lable>
		<br>
		<lable>BeverageDTO:${ juice.getOwnerName()}</lable>
		<br>
		<lable>BeverageDTO:${ juice.getBeverageId()}</lable>
		<br>
		<lable>BeverageDTO:${ juice.getBeverageShopName()}</lable>
		<br>
		<lable>BeverageDTO:${ juice.getBeverageShopPH()}</lable>
		<br>
		<lable>BeverageDTO:${ juice.getBeverageShopLocation()}</lable>
		<br>

	</form>
</body>
</html>