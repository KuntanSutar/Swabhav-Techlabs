<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit here</title>
</head>
<body>

	<form action="edit" method="POST">
		Name : <input type="text" name="name" value="${requestScope.name}" placeholder="Enter Name"> <br>
		CGPA : <input type="text" name="cgpa" value="${requestScope.cgpa}" placeholder="Enter CGPA"> <br>
		Roll Number : <input type="text" name="rollNo" value="${requestScope.rollNo}" placeholder="Enter Roll Number" readonly="readonly"> <br>
		<input type="submit" value="Edit"> <br>
	</form>
	
</body>
</html>