<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript">

function noBack(){

	window.history.forward();
	
}

</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="noBack();" onunload="">

<form:form action="${pageContext.request.contextPath}/propNumInsertAction" id="propNumInsertFormId" commandName="propNumInsertForm" autocomplete="off" method="post" enctype="multipart/form-data">


<h6 align="center" style="color: black ; font-weight: bold; font-size: larger;">${message}</h6>

<p><label>Choose File:</label></p>  
<p><input type="file" accept=".csv,.xls,.xlsx" name="file" id="propslFile" /></p>  
<p><input type="submit" name="submitPropslFile" id="submitPropslFileBtId" value="Submit"/></p> 

<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="${pageContext.request.contextPath}/logoutAction" >Logout</a>

</form:form>  
</body>
</html>