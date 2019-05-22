<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.techlab.business.Student"%>

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
		out.print("<table border='2px'>");
		out.print("<tr><th>Name</th><th>CGPA</th><th>Roll No</th><th>Edit</th><th>Delete</th></tr>");
		for(Student student:studentList) {
			out.print("<tr><td>"+student.getName()+"</td><td>"+student.getCgpa()+"</td><td>"+student.getRollNo()+"</td>");
			out.print("<td><a href="+"edit?rollNo="+student.getRollNo()+">Edit</a></td>");
			out.print("<td><a href="+"delete?rollNo="+student.getRollNo()+">Delete</a></td></tr>");
		}
		out.print("</table>");
	%>
	<br>
	<a href="http://localhost:8080/student-mvc-app/">Home Page</a>
	<a href="add">Add Student</a>
	<a href="logout">Log Out</a>
</body>
</html>