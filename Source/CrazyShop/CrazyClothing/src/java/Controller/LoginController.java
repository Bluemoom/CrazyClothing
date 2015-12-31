/*
 * Servlet xu ly request cho login va register
 */
package controller;

import dao.CustomerDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.*;

/**
 *
 * @author sunny
 */
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String action = request.getParameter("action");
        String url = "";
        String error = "";

        if (action.equals("login")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            CustomerDao ctmDao = new CustomerDao();
            int rule = -1;
            try {
                rule = ctmDao.checkLogin(username, password);
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (rule == 0) {
                Customer customer = null;
                try {
                    customer = ctmDao.findById(username,password);
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
                session.setAttribute("customer", customer);
                url = "index.jsp";
            } else if (rule == 1) {
                url = "Employee.jsp";
            } else if (rule == 2) {
                url = "Admin.jsp";
            } else {
                url = "Login.jsp";
                error = "Thông tin đăng nhập không chính xác";
            }

            session.setAttribute("error", error);
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
