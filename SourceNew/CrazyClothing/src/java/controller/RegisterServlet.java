/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CustomerDao;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;

public class RegisterServlet extends HttpServlet {

    private CustomerDao ctd = new CustomerDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        String action = request.getParameter("action");
        String Url = "";
        String Name = request.getParameter("name");
        String username_err = "";
        String Email = request.getParameter("email");
        String Address = request.getParameter("address");
        String Phone = request.getParameter("phone");
        String Username = (String) request.getParameter("username");

        try {
            if (ctd.CheckUserInFo(Username)) {
                username_err = "Tài khoản đã tồn tại !";
                session.setAttribute("username_err", username_err);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        String Password = request.getParameter("password");
        String RetypePassword = request.getParameter("retypepassword");
        String retypepassword_err = "";
        if (ctd.checkPassword(RetypePassword, Password) == false) {
            retypepassword_err = "Mật khẩu không khớp";
            request.setAttribute("retypepassword_err", retypepassword_err);
        }
        request.setAttribute("username", Username);
        request.setAttribute("address", Address);
        request.setAttribute("name", Name);
        request.setAttribute("phone", Phone);
        request.setAttribute("email", Email);
        try {
            if (username_err.length() == 0 && retypepassword_err.length() == 0) {
                Customer ctm = new Customer(ctd.sinhMa(ctd.GetUserID()), Name, Email, Address, Phone, Username, Password, 0, 1);
                ctd.addUserInfor(ctm);
                Url = "/index.jsp";
            } else {
                Url = "/Register.jsp";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        RequestDispatcher rd = request.getRequestDispatcher(Url);
        rd.forward(request, response);
    }
}
