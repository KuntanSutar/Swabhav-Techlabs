<%
        Cookie color = new Cookie("color", "red");
        color.setMaxAge(60); 
        response.addCookie(color);
%>
<html>
<body bgcolor="<%= color.getValue() %>">
    <h1>Setting Cookies</h1>
        
</body>
</html>