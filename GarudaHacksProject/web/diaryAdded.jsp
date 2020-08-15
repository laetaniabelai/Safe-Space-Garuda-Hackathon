<%-- 
    Document   : diaryAdded
    Created on : Aug 16, 2020, 5:24:49 AM
    Author     : campf
--%>

<%@page import="java.sql.Connection"%>
<%@page import="garuda.hacks.model.Diary"%>
<%@page import="java.util.Date"%>
<%@page import="garuda.hacks.model.dao.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Diary Added</title>
    </head>
    <body>
        <%@ include file="navbar.jsp" %>
        <br><br><br><br>
         <div style="position: fixed; top: 30%; left: 50%; transform: translate(-50%, -50%);">
        <p class="display-4">You have successfully create new diary! Click <a href="myspace.jsp">here</a> to go to the main page</p>
        </div>
    </body>
</html>
