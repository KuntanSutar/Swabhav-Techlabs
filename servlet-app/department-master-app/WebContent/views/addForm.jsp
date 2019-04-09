<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Department Form</title>
</head>
<body>
	<h1>Department Form</h1>
	<form action="add" method="POST">
		Number : <input type="number" name="deptNo" value="${requestScope.deptNo}" placeholder="Enter Department Number" required="required"> <br>
		Name : <input type="text" name="deptName" value="${requestScope.deptName}" placeholder="Enter Department Name" required="required"> <br>
		Location : <input type="text" name="deptLocation" value="${requestScope.deptLocation}" placeholder="Enter Department Location" required="required"> <br>
		<input type="submit" value="Add Department"> <br>
	</form>
	<br>
	
</body>
</html>