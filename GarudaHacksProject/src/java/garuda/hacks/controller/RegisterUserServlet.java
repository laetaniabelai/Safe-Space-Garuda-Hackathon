package uts.isd.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import garuda.hacks.model.User;
import garuda.hacks.model.dao.DBUserManager;

public class RegisterUserServlet extends HttpServlet {
   

    @Override   
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {       
        HttpSession session = request.getSession();
        
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        
        
        DBUserManager manager = (DBUserManager) session.getAttribute("manager");
        Validator validator = new Validator();
        
        // validate email
        if (!validator.validateEmail(email)) {           

            // set incorrect email error to the session if the email format doesn't match with the validator  
            session.setAttribute("errMsg", "Error: email format incorrect");

            // redirect user back to the index.jsp if the email format doesn't match with the validator
            request.getRequestDispatcher("index.jsp").include(request, response);
            
        // validate password
        } else if (password instanceof String == false) {                  
            
            // set incorrect password error to the session           
            session.setAttribute("errMsg", "Error: password format incorrect");
            
            // redirect user back to the index.jsp          
            request.getRequestDispatcher("index.jsp").include(request, response);
        
        // validate name  
        } else if (name.contains("[0-9]+") == true) {
            
            // set incorrect name error to the session           
            session.setAttribute("errMsg", "Error: name format incorrect");
            
            // redirect user back to the login.jsp          
            request.getRequestDispatcher("index.jsp").include(request, response);
        } else {
        
            try {
                if (manager.findUser(email) == null) {
                    manager.addUser(email, name, password);
                    User user = new User(email, name, password);
                    session.setAttribute("user", user);

                    response.sendRedirect("mainpage.jsp");
                } else {
                    session.setAttribute("errMsg", "Error: email is already used");
                    response.sendRedirect("register.jsp");
                }
            } catch (SQLException ex) {
                Logger.getLogger(RegisterUserServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}