<html>
    <body>
        <a href="session.jsp">Session</a>
        <a href="application.jsp"></a>

        <h1>Last value of session : <%= (Integer)session.getAttribute("visitCounter")%></h1>
        <h1>Last value of application : <%= (Integer)application.getAttribute("visitCounter")%></h1>
    </body>
</html>