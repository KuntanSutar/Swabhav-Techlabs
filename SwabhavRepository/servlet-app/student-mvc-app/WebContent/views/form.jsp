<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students Form</title>
</head>
<body>

	<form action="add" method="POST">
		Name : <input type="text" name="name" value="${requestScope.name}" placeholder="Enter Name"> <br>
		CGPA : <input type="text" name="cgpa" value="${requestScope.cgpa}" placeholder="Enter CGPA"> <br>
		Roll Number : <input type="text" name="rollNo" value="${requestScope.rollNo}" placeholder="Enter Roll Number"> <br>
		<input type="submit" value="Add Student"> <br>
	</form>
	<br>
	<a href="http://localhost:9090/student-mvc-app/">Home Page</a>
</body>
</html>