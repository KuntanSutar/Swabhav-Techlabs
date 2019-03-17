<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.techlab.student.Student"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<h1>Students Details</h1>
	<% 
		ArrayList<Student> studentList = (ArrayList) request.getAttribute("studentDetails");
		for(Student student:studentList) {
			out.print(student.getName()+"..."+student.getCgpa()+"..."+student.getRollNo()+"<br>");
			out.print("<a href="+"http://localhost:9090/student-mvc-app/edit?rollNo="+student.getRollNo()+">Edit</a><br>");
			out.print("<a href="+"http://localhost:9090/student-mvc-app/delete?rollNo="+student.getRollNo()+">Delete</a><br>");
		}
	%>
	<br>
	<a href="http://localhost:9090/student-mvc-app/">Home Page</a>
</body>
</html>