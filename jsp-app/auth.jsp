<html>
    <body>
        <% 
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            if(username.equals("admin") || password.equals("admin")) {
                out.println("Welcome "+username);
            } else {
                out.println("<h3 style='color:red'>Invalid username or password</h3>"+"<br>");
                out.println("<a href='login.html'>Login</a>");
            }
        %>
    </body>
</html>