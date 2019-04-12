<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello world</h1>


<%-- <a href="${pageContext.request.contextPath}/indexPageAction" >Go To Home Page</a> --%>


<a href="${pageContext.request.contextPath}/dataSortAction">Data Sorting</a>
<a href="${pageContext.request.contextPath}/branchAddressUpdateAction">Branch Address Update</a>
<%-- <a href="${pageContext.request.contextPath}/fileZipAction" >Data Rename</a> --%>

</body>
</html>