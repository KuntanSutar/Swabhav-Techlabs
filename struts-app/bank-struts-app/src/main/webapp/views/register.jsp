<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.0/css/mdb.min.css" rel="stylesheet">
<style type="text/css">
.errorMessage {
	color: red;
}
</style>
</head>
<body>
	<h1>Register Action</h1>
	
	<s:form action="register.do" method="post">
		<s:textfield key="Name" name="account.name"></s:textfield>
		<s:textfield key="Balance" name="account.balance"></s:textfield>
		<s:textfield key="Password" name="account.password"></s:textfield>
		<s:submit key="submit" value="Submit"></s:submit>
	</s:form>
	
</body>
</html>