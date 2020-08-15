<%-- 
    Document   : index
    Created on : Aug 14, 2020, 9:00:30 PM
    Author     : Finola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>My Safe Space</title>
            <link rel="stylesheet" href="css/style.css" type="text/css"/>
        </head>
        <body>
                <%@include file = "navbar.jsp" %>
                <% String errMsg = (String)session.getAttribute("errMsg"); %>
                <% 
                String existErr = (String) session.getAttribute("existErr");
                String emailErr = (String) session.getAttribute("emailErr");
                 String passErr = (String) session.getAttribute("passErr");
                %>    
            <% if (errMsg != null) { %>
            <div class="alert alert-danger alert-dismissible fade show" role="alert">
                <strong>Error has occurred!</strong> <%= errMsg %>
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <% } %>
                </br></br>
                <section class="headbanner">
                        <div class ="backImage">
                            <div class="register">
                                <form action="<%=request.getContextPath()%>/LoginServlet" method="post">
                                    <fieldset class="loginframe">
                                        <legend> Login </legend>
                                        <input type="text" name="name" placeholder="Enter the email" size="30"> </br>
                                        <input type="password" name="password" placeholder= "Enter password" size="30"> </br>
                                        <input type="submit" value="Submit" class="submit"></br></br>
                                    </fieldset>
                                </form>
                                </br>
                                <form action="<%=request.getContextPath()%>/RegisterUserServlet" method="post">
                                    <fieldset class="loginframe">
                                        <legend> Sign Up </legend>
                                       <input type="text" name="name" placeholder="Enter Your Username" size="30"> </br>
                                       <input type="text" name="email" placeholder="Enter Your Email" size="30"> </br>
                                       <input type="password" name="password" placeholder="Enter Your Password" size="30"></br>
                                       <input type="submit" value="Submit" class="submit"> </br></br>
                                    </fieldset>
                                </form>
                            </div>
                        </div>
                    </br></br>
                        <div class="text">
                            <H1 class="intro">Welcome to </br> MY SAFE SPACE</H1>
                            <h3 class="intro"> 
                                MY SAFE SPACE is a free online online platform for you  
                                </br> to journal out your feelings during this difficult time.</h3>
                            <h3 class="intro">Make it your safe space to work through your negative thoughts and emotions 
                                </br> and start improving your mental health today</h3>
                        </br></br></br></br></br></br></br></br></br></br></br>
                        </div>>
                </section>
                <section class="features">
                    </br>
                    <h1> Start Journaling for Your Mental Health </h1>
                    <p>Start your simple yet important experience of journaling online today. 
                    </br>Explore new ways to learn more about yourself and how you can take care of your mental health in this difficult time</p>
                    </br></br>
                </section>
                <section class="platform">
                     </br>
                     <h1><em>“Give yourself the same care & attention that you give to others </br> and watch yourself bloom”</em></h1>
                    </br></br>
                </section>
                <section class="termsandconditions">
                    </br>
                    <h1> Learn More About Yourself </h1>
                    <p> Recognize and track causes of negative emotions and use journaling to help you find ways to reduce them.</br>
                        Learn to prioritize your problems, concerns, and fear and learn more about yourself. </p>
                    <%--<ul> This is features paragraph </ul>--%>
                    </br></br>
                </section>
                                    
        <% if (existErr != null) { %>
        <div class="alert alert-danger alert-dismissible fade show" role="alert">
                <strong>Login failed!</strong> Incorrect account details.
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                <span aria-hidden="true">&times;</span>
                </button>
        </div>
        <% } %>
        <jsp:include page="/ConnServlet" flush="true" />
        </body>
        <footer>MY SAFE SPACE<sup>TM</sup> 2020 &nbsp | &nbsp Garuda Hacks</footer>
    </html>