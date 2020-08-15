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
                                        <input type="text" name="name" placeholder="Enter the email" size="30"> </br></br>
                                        <input type="password" name="password" placeholder= "Enter password" size="30"> </br></br>
                                        <button type="submit" value="Submit" class="submit">Submit</button></br></br>
                                    </fieldset>
                                </form>
                                </br>
                                <form action="<%=request.getContextPath()%>/RegisterUserServlet" method="post">
                                    <fieldset class="loginframe">
                                       <input type="text" name="name" placeholder="Enter Your Username" size="30"> </br></br>
                                       <input type="text" name="email" placeholder="Enter Your Email" size="30"> </br></br>
                                       <input type="password" name="password" placeholder="Enter Your Password" size="30">
                                       <h6><input type="checkbox" name="" > I agree to the terms & conditions</h6>
                                       <input type="submit" value="Submit" class="submit"> </br></br></br>
                                    </fieldset>
                                </form>
                            </div>
                        </div>
                    </br></br></br></br>
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
                    <h1> Need Someone To Talk To? </h1>
                    <p>Chat online with caring listeners and meet people who understand.
                    </br> You can find support and friendship in chat rooms for many issues like depression, anxiety, relationships, and more.</p>
                    </br></br>
                </section>
                <section class="platform">
                    <h1> Contribute and Provide Mental Support
                        </br> For Those in Need </h1>
                    <p> Most people simply needs a good listener. </br>
                        Be one of them and watch how a conversation can make a difference between a good day and a bad day.</p>
                    </br></br>
                </section>
                <section class="termsandconditions">
                    <h1> Terms & Conditions </h1>
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
        
        <footer>footer</footer>
        </body>
    </html>