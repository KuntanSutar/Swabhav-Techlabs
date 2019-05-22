<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Add Contact</title>
	<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.0/css/mdb.min.css" rel="stylesheet">
	<style type="text/css">
		.errorMessage {
			color: red;
		}
	</style>
</head>
<body>

	<s:form action="add.do">
		<s:textfield key="Name" name="contact.name" requiredLabel="true"></s:textfield>
		<s:textfield key="Email" name="contact.email" requiredLabel="true"></s:textfield>
		<s:submit key="submit" value="Submit"></s:submit>
	</s:form>
	
</body>
</html>