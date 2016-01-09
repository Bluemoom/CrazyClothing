/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClothDao;
import dao.GroupClothDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;

/**
 *
 * @author Mr_Dat
 */
public class ClothServlet extends HttpServlet {

    ClothDao cld = new ClothDao();
    GroupClothDao grc = new GroupClothDao();
    
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
        String groupCloth = request.getParameter("groupCloth");  
        GroupCloth gr = new GroupCloth();
        try {
            gr = grc.GetGroupCloth(groupCloth);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClothServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClothServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        String clothName = request.getParameter("clothName");
        String image ="images/"+ request.getParameter("image");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        int sale = Integer.parseInt(request.getParameter("sale"));
        int status = Integer.parseInt(request.getParameter("status"));
        int neww = Integer.parseInt(request.getParameter("neww"));
        try {
            Cloth cl = new Cloth(cld.sinhMa(cld.GetClothID()),gr, clothName, image, quantity, description, price, sale, status, neww);
            cld.addNewCloth(cl);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClothServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClothServlet.class.getName()).log(Level.SEVERE, null, ex);
        }  
        RequestDispatcher rd = request.getRequestDispatcher("ClothManagement.jsp");
        rd.forward(request, response);
    }  
}
