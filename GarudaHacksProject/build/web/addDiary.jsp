<%-- 
    Document   : addDiary
    Created on : Aug 16, 2020, 4:55:10 AM
    Author     : campf
--%>

<%@page import="garuda.hacks.model.Diary"%>
<%@page import="java.util.Date"%>
<%@page import="garuda.hacks.model.dao.DBDiary"%>
<%@page import="java.sql.Connection"%>
<%@page import="garuda.hacks.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>My Safe Space</title>
    </head>
    <body>
        <%            
            String managerErr = (String) session.getAttribute("managerErr");
            String existDiaryErr = (String) session.getAttribute("existDiaryErr");
            String dateErr = (String) session.getAttribute("dateErr");
            String exceptionErr = (String) session.getAttribute("exceptionErr");
        %>
        </br>
        <%@ include file="navbar.jsp" %>
        </br></br>
        <h1 style="text-align:center;">Create New Diary</h1>
        <%--<h3 style="text-align:center;"><span class="message" style="color:red;"> <%=(existDeviceErr != null ? existDeviceErr : "")%></span></h3>--%>
        <h3 style="text-align:center;"><span class="message" style="color:red;"> <%=(managerErr != null ? managerErr : "")%></span></h3>
        <br><br><br><br><br>
            <form method="post" action="addDiaryServlet" >
                <div style="position: fixed; top: 115%; left: 50%; transform: translate(-50%, -50%);">
                    <div class="form-inline">
                        <div class="form-group">
                            <input class="form-control" type="text" placeholder="<%=(dateErr != null ? dateErr : "Enter Date (MM/dd/yyyy)")%>" name="date">
                        </div>
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                        <div class="form-group">
                            <input class="form-control" type="text" placeholder="Enter Title" name="title">
                        </div>
                    </div>
                    <div class="form-group">
                       </br> <label for="problem">Problem Description:</label></br>
                        <textarea class="form-control" name="problem" placeholder="Describe problems" rows="10" cols="30"></textarea>
                    </div>
                    <div class="form-group">
                        <label for="solution" >Solution:</label></br>
                        <textarea class="form-control" name="solution" placeholder="Describte how you have solved the problems" rows="10" cols="30"></textarea>
                    </div>
                    <input class="btn btn-secondary" type="submit" value="Submit">
                    <a class="btn btn-secondary" href="myspace.jsp" role="button">Cancel</a>

                    <input type="hidden" name="NewAccount" value="true" />
                </div>
            </form>
        </main>>
    </body>
</html>
