package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import garuda.hacks.model.dao.DBUserManager;
import java.sql.Connection;
import garuda.hacks.model.dao.DBConnector;
import garuda.hacks.model.User;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write(" <html>\r\n");
      out.write("        <head>\r\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\r\n");
      out.write("            <title>My Safe Space</title>\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/home.css\" type=\"text/css\"/>\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/navbar.css\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        ");

        DBConnector connector = new DBConnector();
        Connection conn = connector.openConnection();
        DBUserManager db = new DBUserManager(conn);
        
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar\">\r\n");
      out.write("            <ul class=\"nav-navbar\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <svg width=\"25px\" height=\"25px\" viewBox=\"0 0 16 16\" class=\"bi bi-chat-dots-fill\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("  <path fill-rule=\"evenodd\" d=\"M16 8c0 3.866-3.582 7-8 7a9.06 9.06 0 0 1-2.347-.306c-.584.296-1.925.864-4.181 1.234-.2.032-.352-.176-.273-.362.354-.836.674-1.95.77-2.966C.744 11.37 0 9.76 0 8c0-3.866 3.582-7 8-7s8 3.134 8 7zM5 8a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm4 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm3 1a1 1 0 1 0 0-2 1 1 0 0 0 0 2z\" />\r\n");
      out.write("</svg>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\"><a href=\"home.jsp\"><strong>HOME</strong></a></li>\r\n");
      out.write("                <li class=\"nav-item\"><a href=\"myspace.jsp\"><strong>MY SPACE</strong></a></li>\r\n");
      out.write("                <li class=\"nav-item\"><a href=\"mydiary.jsp\"><strong>MY DIARY</strong></a></li>\r\n");
      out.write("                <li class=\"nav-item\"><a href=\"addDiary.jsp\" role=\"button\"><strong>ADD DIARY</strong></a></li>\r\n");
      out.write("                <li class=\"nav-item\"><a href=\"info.jsp\"><strong>INFO</strong></a></li>\r\n");
      out.write("                <li class=\"nav-item\"><a href=\"logout.jsp\"><strong>LOGOUT</strong></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("                ");
 String errMsg = (String)session.getAttribute("errMsg"); 
      out.write("\r\n");
      out.write("                ");
 if (errMsg != null) { 
      out.write("\r\n");
      out.write("            <div class=\"alert alert-danger alert-dismissible fade show\" role=\"alert\">\r\n");
      out.write("                <strong>Error has occurred!</strong> ");
      out.print( errMsg );
      out.write("\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\r\n");
      out.write("                <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("                </br></br>\r\n");
      out.write("                <section class=\"headbanner\">\r\n");
      out.write("                        <div class =\"backImage\">\r\n");
      out.write("                            <div class=\"register\">\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    <fieldset class=\"loginframe\">\r\n");
      out.write("                                        <legend> Login </legend>\r\n");
      out.write("                                        <input type=\"text\" name=\"name\" placeholder=\"Enter the email\" size=\"30\"> </br>\r\n");
      out.write("                                        <input type=\"password\" name=\"password\" placeholder= \"Enter password\" size=\"30\"> </br>\r\n");
      out.write("                                        <input type=\"submit\" value=\"Submit\" class=\"submit\"></br></br>\r\n");
      out.write("                                    </fieldset>\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <form action=\"");
      out.print(request.getContextPath());
      out.write("/RegisterUserServlet\" method=\"post\">\r\n");
      out.write("                                    <fieldset class=\"loginframe\">\r\n");
      out.write("                                        <legend> Sign Up </legend>\r\n");
      out.write("                                       <input type=\"text\" name=\"name\" placeholder=\"Enter Your Username\" size=\"30\"> </br>\r\n");
      out.write("                                       <input type=\"text\" name=\"email\" placeholder=\"Enter Your Email\" size=\"30\"> </br>\r\n");
      out.write("                                       <input type=\"password\" name=\"password\" placeholder=\"Enter Your Password\" size=\"30\"></br>\r\n");
      out.write("                                       <input type=\"submit\" value=\"Submit\" class=\"submit\"> </br></br>\r\n");
      out.write("                                    </fieldset>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </br></br>\r\n");
      out.write("                        <div class=\"text\">\r\n");
      out.write("                            <H1 class=\"intro\">Welcome to </br> MY SAFE SPACE</H1>\r\n");
      out.write("                            <h3 class=\"intro\"> \r\n");
      out.write("                                MY SAFE SPACE is a free online online platform for you  \r\n");
      out.write("                                </br> to journal out your feelings during this difficult time.</h3>\r\n");
      out.write("                            <h3 class=\"intro\">Make it your safe space to work through your negative thoughts and emotions \r\n");
      out.write("                                </br> and start improving your mental health today</h3>\r\n");
      out.write("                        </br></br></br></br></br></br></br></br></br></br></br>\r\n");
      out.write("                        </div>>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section class=\"features\">\r\n");
      out.write("                    </br>\r\n");
      out.write("                    <h1> Start Journaling for Your Mental Health </h1>\r\n");
      out.write("                    <p>Start your simple yet important experience of journaling online today. \r\n");
      out.write("                    </br>Explore new ways to learn more about yourself and how you can take care of your mental health in this difficult time</p>\r\n");
      out.write("                    </br></br>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section class=\"platform\">\r\n");
      out.write("                     </br>\r\n");
      out.write("                     <h1><em>“Give yourself the same care & attention that you give to others </br> and watch yourself bloom”</em></h1>\r\n");
      out.write("                    </br></br>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section class=\"termsandconditions\">\r\n");
      out.write("                    </br>\r\n");
      out.write("                    <h1> Learn More About Yourself </h1>\r\n");
      out.write("                    <p> Recognize and track causes of negative emotions and use journaling to help you find ways to reduce them.</br>\r\n");
      out.write("                        Learn to prioritize your problems, concerns, and fear and learn more about yourself. </p>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    </br></br>\r\n");
      out.write("                </section>\r\n");
      out.write("            <footer>MY SAFE SPACE<sup>TM</sup> 2020 &nbsp | &nbsp Garuda Hacks</footer>  \r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/ConnServlet", out, true);
      out.write("\r\n");
      out.write("        </body>\r\n");
      out.write("    </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
