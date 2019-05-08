<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Contact</title>
</head>
<body>
	<s:form action="add.do" method="post">
		<s:textfield key="Name" name="contact.name"></s:textfield>
		<s:textfield key="Email" name="contact.email"></s:textfield>
		<s:submit key="submit" value="Submit"></s:submit>
	</s:form>
</body>
</html>