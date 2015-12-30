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
                ClothBuy clothBuy = new ClothBuy(cld.findById(clothID), 1);
                List<ClothBuy> cart = new ArrayList<ClothBuy>();
                double totalPrice = 0;
                // trường hợp chưa mua sản phẩm nào
                if (session.getAttribute("cart") == null) {
                    cart.add(clothBuy);
                    session.setAttribute("cart", cart);
                } else {
                    // trường hợp đã mua sản phẩm
                    int temp = 0;
                    cart = (ArrayList<ClothBuy>) session.getAttribute("cart");
                    // Kiểm tra xem sản phẩm có trong giỏ chưa. nếu có thì tăng số lượng
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
                // Tính tổng tiền cho giỏ
                for (ClothBuy cb : cart) {
                    totalPrice += cb.getQuantityBuy() * cb.getCloth().getPrice() * (1 - ((double) cb.getCloth().getSale() / 100));
                }
                session.setAttribute("totalPrice", totalPrice);
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
