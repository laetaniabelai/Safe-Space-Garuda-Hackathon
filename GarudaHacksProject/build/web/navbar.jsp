<%-- 
    Document   : navigation
    Created on : Aug 14, 2020, 9:43:48 PM
    Author     : Finola
--%>

<%@page import="garuda.hacks.model.dao.DBUserManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="garuda.hacks.model.dao.DBConnector"%>
<%@page import="garuda.hacks.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/navbar.css" type="text/css"/>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <%
        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBUserManager db = new DBUserManager(conn);
        %>
    </head>
    <body>
        <nav class="navbar">
            <ul class="nav-navbar">
                <li class="nav-item">
                    <svg width="25px" height="25px" viewBox="0 0 16 16" class="bi bi-chat-dots-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M16 8c0 3.866-3.582 7-8 7a9.06 9.06 0 0 1-2.347-.306c-.584.296-1.925.864-4.181 1.234-.2.032-.352-.176-.273-.362.354-.836.674-1.95.77-2.966C.744 11.37 0 9.76 0 8c0-3.866 3.582-7 8-7s8 3.134 8 7zM5 8a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm4 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm3 1a1 1 0 1 0 0-2 1 1 0 0 0 0 2z" />
</svg>
                </li>
                <li class="nav-item"><a href="home.jsp"><strong>HOME</strong></a></li>
                <li class="nav-item"><a href="myspace.jsp"><strong>MY SPACE</strong></a></li>
                <li class="nav-item"><a href="mydiary.jsp"><strong>MY DIARY</strong></a></li>
                <li class="nav-item"><a href="addDiary.jsp" role="button"><strong>ADD DIARY</strong></a></li>
                <li class="nav-item"><a href="info.jsp"><strong>INFO</strong></a></li>
                <li class="nav-item"><a href="logout.jsp"><strong>LOGOUT</strong></a></li>
            </ul>
        </nav>
    </body>
</html>
