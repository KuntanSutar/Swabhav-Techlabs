<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form action="register" method="post">
		Username: <input type="text" name="username" placeholder="Enter Username" required="required"> <br>
		Balance: <input type="text" name="balance" placeholder="Enter Balance" required="required"> <br>
		Password: <input type="text" name="password" placeholder="Enter Password" required="required"> <br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>