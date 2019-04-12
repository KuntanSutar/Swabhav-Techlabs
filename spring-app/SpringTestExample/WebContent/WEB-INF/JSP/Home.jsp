<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="sp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<sp:form action="${pageContext.request.contextPath}/testNewAction" id="testFormId" commandName="testForm" autocomplete="off" method="post">
<h1>${message}</h1>
<h4> First Name:${testForm.empDispFstName} </h4>
<h4> Last Name:${testForm.empDispLstName} </h4>
</sp:form> 

</body>
</html>