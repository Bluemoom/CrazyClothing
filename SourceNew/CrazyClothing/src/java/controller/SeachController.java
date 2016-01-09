/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sunny
 */
public class SeachController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String seachPrice = request.getParameter("seachPrice");
        String querySeach = "";
        if(seachPrice.equals("1")) {
            querySeach="and Price < 300000";
        } else if(seachPrice.equals("2")) {
            querySeach="and Price > 300000 and Price < 500000";
        } else if (seachPrice.equals("3")){
           querySeach="and Price > 500000 and Price < 1000000"; 
        } else if (seachPrice.equals("4")){
           querySeach="and Price > 1000000 and Price < 2000000"; 
        } else if (seachPrice.equals("5")){
           querySeach="and Price > 2000000"; 
        }
        session.setAttribute("querySeach", querySeach);
        session.setAttribute("groupIDD", request.getParameter("groupIDD"));
        String url =request.getParameter("url");
        response.sendRedirect(url);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

   

}
