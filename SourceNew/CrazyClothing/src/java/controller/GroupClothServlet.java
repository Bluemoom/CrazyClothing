/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.GroupClothDao;
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
import model.GroupCloth;

/**
 *
 * @author Mr_Dat
 */
public class GroupClothServlet extends HttpServlet {
  
   private GroupClothDao grc = new GroupClothDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {           
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String groupName = request.getParameter("groupName");
        String image = request.getParameter("image");
        String groupTop = request.getParameter("groupTop");   
                         
            try {
                GroupCloth gr = new GroupCloth(grc.sinhMa(grc.GetgroupID()), groupName, image, groupTop);
                grc.addNewGroupCloth(gr);
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(GroupClothServlet.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (ClassNotFoundException ex) {
                Logger.getLogger(GroupClothServlet.class.getName()).log(Level.SEVERE, null, ex);
            }       
            try {             
                request.setAttribute("Admin", grc.showDanhMuc());
            } catch (SQLException ex) {
                Logger.getLogger(GroupClothServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                 Logger.getLogger(GroupClothServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
            rd.forward(request, response);
        }
}
