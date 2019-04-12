<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form:form action="${pageContext.request.contextPath}/testAction" id="testFormId" commandName="testForm" autocomplete="off" method="post">

<table>

<%-- <tr>

<td> Employee Id <form:input path="empID" id="empId" /> </td>

</tr> --%>

<tr>

<td> First Name : <form:input path="empFirstName" id="empNameId" /> </td>

</tr>

<tr>

<td> Last Name : <form:input path="empLastName" id="empSurNameId" /> </td>

</tr>

<tr>

<td> Contact No : <form:input path="empContactNo" id="empContactNoId" /> </td>

</tr>

<tr>

<td> City : <form:select path="city" id="empCityId" items="${citylst}"></form:select></td>

</tr>

</table>

<input type="submit" name="submitForm" id="submitBtId" value="Submit"/> 

</form:form>  
</body>
</html>