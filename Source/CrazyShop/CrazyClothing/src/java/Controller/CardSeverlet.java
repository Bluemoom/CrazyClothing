/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.ClothDao;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Card;
import model.Cloth;

/**
 *
 * @author Mr_Dat
 */
public class CardSeverlet extends HttpServlet {

    private ClothDao clo = new ClothDao();
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      HttpSession session = request.getSession();
      Card card = (Card) session.getAttribute("card");
      String clothid = request.getParameter("clothID");
      String command = request.getParameter("command");
      ArrayList<Long> listbuy = null;
      String url ="/Bag.jsp";   
      try
      {
          listbuy = (ArrayList<Long>) session.getAttribute("CardID");
          long BuyID = 0;
          if (request.getParameter("CardID") != null)
          {
              BuyID = Long.parseLong(request.getParameter("CardID"));
          }
              Cloth cloth = clo.ShowDetailCloth(clothid);        
              if ("Insert".equals(command))
              {
                  if(listbuy == null)
                  {
                      listbuy = new ArrayList<Long>();
                      session.setAttribute("CardID", listbuy);
                  }
                  if (listbuy.indexOf(BuyID) == -1)
                  {
                      card.InsertToCard(cloth, 1);
                      listbuy.add(BuyID);
                  }
                  url="/Bag.jsp";
              }   
              else
              {
                  return;
              }
              RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
              rd.forward(request, response);         
      }
      catch (Exception ex)
      {}
    }

 
}
