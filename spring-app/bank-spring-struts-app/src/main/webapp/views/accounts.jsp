<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList" %>
<%@page import="com.techlab.business.Account"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accounts</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
<body style="background-color:#e6f9ff;">

	<div align='center'>
		<h1><s:property value="totalAccounts"/></h1>
		<h1>Account Details</h1>
		<%
			ArrayList<Account> accountList = (ArrayList) request.getAttribute("accountList");
			if(accountList!=null) {
				out.print("<table class='table-condensed'>");
				out.print("<tr><th>Username</th><th>Balance</th><th>Password</th></tr>");
				for (Account account : accountList) {
					out.print("<tr><td>" + account.getName() + "</td><td>" + account.getBalance() + "</td><td>"
							+ account.getPassword() + "</td></tr>");
				}
				out.print("</table>");
			} else {
				out.print("No records found!");
			}
		%>
		<br>
		<a href="http://localhost:9090/bank-spring-struts-app/">Goto Home</a> <br>
		<a href="register">Register Account</a> <br>
		
	</div>
	
</body>
</html>