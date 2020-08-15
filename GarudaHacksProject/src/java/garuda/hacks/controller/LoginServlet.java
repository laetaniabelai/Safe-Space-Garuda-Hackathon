package garuda.hacks.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import garuda.hacks.model.User;
import garuda.hacks.model.dao.DBConnector;
import garuda.hacks.model.dao.DBUserManager;


public class LoginServlet extends HttpServlet {

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1- retrieve the current session
        HttpSession session = request.getSession();

        //2- create an instance of the Validator class    
        Validator validator = new Validator();
        //3- capture the posted email      
        String email = request.getParameter("email");
        //4- capture the posted password    
        String password = request.getParameter("password");
        //5- retrieve the manager instance from session      
        DBUserManager manager = (DBUserManager) session.getAttribute("manager");

        User user = null;

        // validate email
        if (!validator.validateEmail(email)) {

            //8-set incorrect email error to the session   
            session.setAttribute("emailErr", "Error: email format incorrect");

            //9- redirect user back to the login.jsp
            request.getRequestDispatcher("index.jsp").include(request, response);

            // validate password
        } else if (password instanceof String == false) {

            //11-set incorrect password error to the session           
            session.setAttribute("passErr", "Error: password format incorrect");
            //12- redirect user back to the login.jsp          
            request.getRequestDispatcher("index.jsp").include(request, response);

        } else {
            try {
                // find user by email and password
                user = manager.loginUser(email, password);

                if (user != null) {
                    //session.setAttribute("user", user);
                    request.getRequestDispatcher("mainpage.jsp").include(request, response);

                } else {
                    session.setAttribute("existErr", "Error: user does not exist!");
                    request.getRequestDispatcher("index.jsp").include(request, response);
                }

            } catch (SQLException | NullPointerException ex) {
                System.out.println(ex.getMessage() == null ? "User does not exist" : "welcome");
                //ex.printStackTrace();
            }
        }

    }
}
