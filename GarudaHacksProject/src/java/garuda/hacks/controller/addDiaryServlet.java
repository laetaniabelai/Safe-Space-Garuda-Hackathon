/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package garuda.hacks.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import garuda.hacks.model.Diary;
import garuda.hacks.model.dao.DBDiary;

/**
 *
 * @author campf
 */
public class addDiaryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        Validator validator = new Validator();
        String date = request.getParameter("date");
        String title = request.getParameter("title");
        String problem = request.getParameter("problem");
        String solution = request.getParameter("solution");
        DBDiary diaryManager = (DBDiary) session.getAttribute("diaryManager");

        //Product product = null;
        validator.clear(session);

        if (!validator.validateDate(date)) {
            session.setAttribute("dateErr", "Error: Date format is incorrect");
            request.getRequestDispatcher("addDiary.jsp").include(request, response);
        } else {
            try {
                if (diaryManager != null) {
                    Diary exist = diaryManager.findDiary(date);

                    if (exist != null) {
                        session.setAttribute("existDiaryErr", "Product already exists in database");
                        request.getRequestDispatcher("addDiary.jsp").include(request, response);
                    } else {
                        diaryManager.addDiary(date, title, problem, solution);
                        Diary diary = new Diary(date, title, problem, solution);
                        session.setAttribute("diary", diary);
                        request.getRequestDispatcher("diaryAdded.jsp").include(request, response);
                    }
                } else {
                    session.setAttribute("managerErr", "Cannot connect to database");
                    request.getRequestDispatcher("addDiary.jsp").include(request, response);
                }
            } catch (SQLException | NullPointerException ex) {
                ex.printStackTrace();
                //Logger.getLogger(addProductServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
