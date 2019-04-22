<html>
    <body>
        <% out.print("Welcome to JSP"); %> <br> 
        <% for(int i=0; i<10; i++) { %>
            <% out.println("Inside for loop"); %> <br>
        <% } %>

        <% for(int i=1; i<=6; i++) { %>
            <% out.println("<h"+i+">Hello</h"+i+">"); %> <br>
        <% } %>

        <% String developerName=request.getParameter("developer"); %>
        <% if(developerName == null && developerName.equals("null")) { %>
            <% out.print("Welcome to JSP!"); %>
        <% } else { %>
            <% out.print(" Hello "+developerName); %>
        <%  } %>
             
        <!-- <% String developerName=request.getParameter("developer"); %>
        <% if(developerName != null && !developerName.equals("null")) { %>
            <% out.print(" Hello "+developerName); %>
        <% } else { %>
            <% out.print("Welcome to JSP!"); %>
        <%  } %> -->
    </body>
</html>
