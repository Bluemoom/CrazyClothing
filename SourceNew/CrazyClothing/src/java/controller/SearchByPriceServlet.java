/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClothDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cloth;

/**
 *
 * @author Mr_Dat
 */
public class SearchByPriceServlet extends HttpServlet {
    
    
    ClothDao cld = new ClothDao();

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
        double price = Double.parseDouble(request.getParameter("price"));
        if (price == 200000)
        {
            try {
                session.setAttribute("arr", cld.searchByPrice(0, price));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SearchByPriceServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
        else if (price == 500000)
        {
            try {
                session.setAttribute("arr", cld.searchByPrice(200000, price));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SearchByPriceServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         else if (price == 1000000)
        {
            try {
                session.setAttribute("arr", cld.searchByPrice(500000, price));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SearchByPriceServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         else if (price == 2000000)
        {
            try {
                session.setAttribute("arr", cld.searchByPrice(1000000, price));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SearchByPriceServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         else if (price == 2100000)
        {
             try {
                session.setAttribute("arr", cld.searchByPrice(2000000, 10000000));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SearchByPriceServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
         {
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
         }
        RequestDispatcher rd = request.getRequestDispatcher("SearchByPrice.jsp");
        rd.forward(request, response);
    }
   
}
