<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>

<h1>Page to send message ...</h1>
	<form action="beer" method="post">
	<pre>
FirstName<input type="text" name="fname" /> 
LastNmae<input  type="text" name="lname" /> 
Gender<input type="radio" id="Male" name="gender" value="Male">Male
	<input type="radio" id="Female" name="gender" value="Female">Female
	<input type="radio" id="other" name="gender" value="other">Other
Reason<textarea rows="5" cols="10" name="reason"></textarea>
Address<textarea rows="5" cols="10" name="address"></textarea>
 <input type="submit" value="send" />
</form>
</body>
</html>