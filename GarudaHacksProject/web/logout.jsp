<%-- 
    Document   : logout
    Created on : Aug 15, 2020, 3:58:34 PM
    Author     : Rina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p class="display-4">You have logged out, click <a href="index.jsp">here</a> to go to the home page</p>
        <% 
            // logs out the user by clearing the session
            session.invalidate(); 
        %>
    </body>
</html>
