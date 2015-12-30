/*
 * Sevlet sử lý cho shopping cart
 */
package controller;

import dao.ClothDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
public class CartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String command = request.getParameter("command");
        String clothID = request.getParameter("clothID");
        ClothDao cld = new ClothDao();
        Cloth cloth = new Cloth();
        String url = "Bag.jsp";
        
        try {
            if (command.equals("buy")) {
                // trường hợp chưa mua sản phẩm nào
                if (session.getAttribute("cart") == null) {       
                    List<ClothBuy> cart = new ArrayList<ClothBuy>();
                    cart.add(new ClothBuy(cld.findById(clothID), 1));
                    session.setAttribute("cart", cart);
                } else {         
                    // trường hợp đã mua sản phẩm
                    List<ClothBuy> cart = (ArrayList<ClothBuy>) session.getAttribute("cart");
                    ClothBuy clothBuy = new ClothBuy(cld.findById(clothID), 1);
                    // Kiểm tra xem sản phẩm có trong giỏ chưa. nếu có thì tăng số lượng
                    int temp = 0;
                    for (ClothBuy cb : cart) {
                        if (cb.cloth.getClothID().equals(clothID)) {

                            cb.setQuantityBuy(cb.getQuantityBuy() + 1);
                            temp = 1;
                        }
                    }
                    // Nếu chưa có thì thêm mới
                    if (temp == 0) {
                        cart.add(clothBuy);
                        session.setAttribute("cart", cart);
                    }
                }
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            }
        } catch (Exception ex) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            doGet(request, response);
    }

}
