<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result of Beer Option Selected</title>
</head>
<body>
	<h1>Beer Information</h1>
	<%
		ArrayList result = (ArrayList) request.getAttribute("brands");
		Iterator iterator = result.iterator();
		while (iterator.hasNext()) {
			out.print("<br>Try : " + iterator.next());
		}
	%>
	<br><a href="http://localhost:9090/beer-app/views/form.html" >Enter Form Again</a>
</body>
</html>