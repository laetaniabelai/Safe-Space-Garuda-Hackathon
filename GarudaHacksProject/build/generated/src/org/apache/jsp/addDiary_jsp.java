package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import garuda.hacks.model.Diary;
import java.util.Date;
import garuda.hacks.model.dao.DBDiary;
import java.sql.Connection;
import garuda.hacks.model.User;
import garuda.hacks.model.dao.DBUserManager;
import java.sql.Connection;
import garuda.hacks.model.dao.DBConnector;
import garuda.hacks.model.User;

public final class addDiary_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("        <title>Create Diary</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
            
            String managerErr = (String) session.getAttribute("managerErr");
            String existDiaryErr = (String) session.getAttribute("existDiaryErr");
            String dateErr = (String) session.getAttribute("dateErr");
            String exceptionErr = (String) session.getAttribute("exceptionErr");
        
      out.write("\r\n");
      out.write("        ");
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
      out.write("        \r\n");
      out.write("        </br></br></br>\r\n");
      out.write("        <h1 style=\"text-align:center;\">Create New Diary</h1>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <h3 style=\"text-align:center;\"><span class=\"message\" style=\"color:red;\"> ");
      out.print((managerErr != null ? managerErr : ""));
      out.write("</span></h3>\r\n");
      out.write("        <main>\r\n");
      out.write("            <form method=\"post\" action=\"addDiaryServlet\" >\r\n");
      out.write("                <div style=\"position: fixed; top: 115%; left: 50%; transform: translate(-50%, -50%);\">\r\n");
      out.write("                    <div class=\"form-inline\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\" placeholder=\"");
      out.print((dateErr != null ? dateErr : "Enter Date (MM/dd/yyyy)"));
      out.write("\" name=\"date\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; \r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input class=\"form-control\" type=\"text\" placeholder=\"Enter Title\" name=\"title\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"problem\">Problem Description:</label></br>\r\n");
      out.write("                        <textarea class=\"form-control\" name=\"problem\" placeholder=\"Describe problems\" rows=\"10\" cols=\"30\"></textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"solution\" >Solution:</label></br>\r\n");
      out.write("                        <textarea class=\"form-control\" name=\"solution\" placeholder=\"Describte how you have solved the problems\" rows=\"10\" cols=\"30\"></textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input class=\"btn btn-secondary\" type=\"submit\" value=\"Submit\">\r\n");
      out.write("                    <a class=\"btn btn-secondary\" href=\"myspace.jsp\" role=\"button\">Cancel</a>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"hidden\" name=\"NewAccount\" value=\"true\" />\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </main>>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
