<html>
    <body>
            <%
               Integer visitCount = (Integer)application.getAttribute("visitCounter");
               if( visitCount == null || visitCount == 0 ) {
                  out.println("Welcome to my website!");
                  visitCount = 1;
               } else {
                  out.println("Welcome back to my website!");
                  visitCount += 1;
               }
               application.setAttribute("visitCounter", visitCount);
            %>
         
            Old Value : <%=(visitCount-1)%> <br>
            New Value : <%=visitCount%> <br>
            <a href="summary.jsp">Summary</a>
    </body>
</html>