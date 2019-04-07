<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.techlab.model.Department"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Department Details</title>
</head>
<body>
	<h1>Department Details</h1>
	<%
		ArrayList<Department> departmentList = (ArrayList) request.getAttribute("departmentList");
		out.print("<table border='2px'>");
		out.print("<tr><th>DEPTNO</th><th>DNAME</th><th>LOC</th><th>EDIT</th><th>DELETE</th></tr>");
		for (Department department : departmentList) {
			out.print("<tr><td>" + department.getNumber() + "</td><td>" + department.getName() + "</td><td>"
			+ department.getLocation() + "</td>");
			out.print("<td><a href="+"edit?deptNo="+department.getNumber()+">Edit</a></td>");
			out.print("<td><a href="+"delete?deptNo="+department.getNumber()+">Delete</a></td></tr>");
		}
		out.print("</table>");
	%>
</body>
</html>