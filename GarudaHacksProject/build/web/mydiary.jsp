<%-- 
    Document   : mydiary
    Created on : Aug 16, 2020, 12:13:38 AM
    Author     : USER
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="garuda.hacks.model.dao.*"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.Connection"%>
<%@page import="garuda.hacks.model.Diary"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Safe Space</title>
    </head>
    <body>
        <%@include file = "navbar.jsp" %>
        <table>
                <thead>
                    <tr>
                        <th>Date</th>
                        <th>Title</th>
                        <th>Problem Description</th>
                        <th>Solution</th>

                    </tr>
                </thead>


                    <tbody>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                    </tbody>

            </table>
    </body>
</html>
