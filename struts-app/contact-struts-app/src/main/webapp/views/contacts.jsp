<%@page import="com.techlab.business.Contact"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
<body style="background-color:#e6f9ff;">
	
	<div align='center'>
		<h1><s:property value="totalContacts"/></h1>
		<h2>Contact Details</h2>
		<%
			ArrayList contactList = (ArrayList) request.getAttribute("contactList");
			out.print("<table class='table-condensed'>");
			if(contactList!=null) {
				out.print("<tr><th>Name</th><th>Email</th><th>Edit</th><th>Delete</th></tr>");
				for(Object contact:contactList) {
					Contact cntct = (Contact)contact; 
					out.print("<tr><td>"+cntct.getName()+"</td><td>"+cntct.getEmail()+"</td>");
					out.print("<td><a href=edit?name="+cntct.getName()+"&email="+cntct.getEmail()+">Edit</a></td>");
					out.print("<td><a href=delete?name="+cntct.getName()+">Delete</a></td></tr>");
				}
				out.print("</table>");
			}
		%>
		<br>
		<a href="http://localhost:8080/contact-struts-app/">Goto Home</a> <br>
		<a href="add">Add Contact</a> <br>
		
	</div>
</body>
</html>