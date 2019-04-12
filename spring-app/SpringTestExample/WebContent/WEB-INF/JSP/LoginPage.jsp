<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%-- <script src="${pageContext.servletContext.contextPath}/RESOURCES/JS/jquery-ui-1.9.2.custom.min.js" type="text/javascript"></script> --%>
<script src="${pageContext.servletContext.contextPath}/RESOURCES/JS/jquery-3.3.1.min.js" type="text/javascript" ></script>

<script type="text/javascript">

function noBack(){

	window.history.forward(); 
	
}

/* function validateSubmit(){

	//alert("1");
	var username = $("#userNameId").val();
	var password = $("#passwordId").val();
	//alert("2");

	if(username == ''){

		alert("Please enter user name");
		return false;

	} else if(password == ''){

		alert("Please enter password");
		return false;

	} else {

		return true;
		
	}
	
} */
</script>

<script type="text/javascript">

$(document).ready( function(){

	$("#submitBtId").click( function(){

		//alert("1");
		var username = $("#userNameId").val();
		var password = $("#passwordId").val();
		//alert("2");

		if(username == ''){

			alert("Please enter user name");
			return false;

		} else if(password == ''){

			alert("Please enter password");
			return false;

		} else {

			return true;
			
		}
		
	});
	
});

</script>

<title>Welcome To SBI Life Insurance</title>
</head>
<body onload="noBack();" onunload="">

<form:form action="${pageContext.request.contextPath}/loginAction" id="loginFormId" commandName="loginForm" method="post" autocomplete="off">  

<table align="center" bgcolor="#106498" border="0" cellpadding="0" cellspacing="0" width="80%">
<tbody><tr align="center" valign="middle">
<td height="41">
<table border="1" cellpadding="0" cellspacing="1" width="100%">
<tbody><tr align="center" valign="middle">
<td height="30">

<table bgcolor="#006699" border="0" cellpadding="0" cellspacing="0" width="100%">
<tbody><tr>
<td width="82%" align="center">
<font color="#ffffff" size="2">
<b>
<font face="Verdana, Arial, Helvetica, sans-serif">Please Login Here</font>
</b>
</font>
</td>    
</tr>
</tbody>
</table>

<table bgcolor="#ffffff" border="0" cellpadding="5" cellspacing="0" width="100%">
<tbody>

<tr>
<td> <b> <font face="Verdana, Arial, Helvetica, sans-serif" > ${message} </font> </b> </td>
</tr>

<tr>
<td align="right" height="61" width="42%" ><font face="Verdana" size="2"><b>User Name : </b></font></td>
<td height="61" width="58%">
<form:input path="userName" id="userNameId" />
</td>
</tr>

<tr>
<td align="right" height="47" width="42%" ><font face="Verdana" size="2"><b>Password : </b></font></td>
<td height="47" width="58%"><font face="Verdana" size="2">
<form:password path="password" id="passwordId" /> 
</font></td>
</tr>

</tbody>
</table>
</td>
</tr>
</tbody>
</table>

</td>
</tr>
</tbody>
</table>

<table align="center" border="0" cellpadding="5" cellspacing="0" width="80%">
<tbody><tr align="center" valign="middle">
<td><font color="white" face="Verdana" size="2"><b>

<input value="Login" name="Submit" type="submit" id="submitBtId">
<!-- onclick="return validateSubmit()"  -->
</b></font></td>
</tr>
</tbody></table>

</form:form>

</body>
</html>