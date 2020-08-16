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
        <title>My Safe Space</title>
        <link rel="stylesheet" href="css/logout.css" type="text/css"/>
    </head>
    <body>
        <%@include file = "navbar.jsp" %>
        <main>
            <div class="container">
                <h1>SEE YOU LATER</br> Until Your Next Thought..</h1>
                <p>You have logged out, click <a href="home.jsp">here</a> to go to the home page</p>
            </div>
        </main>
        <% 
            // logs out the user by clearing the session
            session.invalidate(); 
        %>
    </body>
</html>
