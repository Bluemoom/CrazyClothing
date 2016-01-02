/*
 * Servlet xu ly request cho login va register
 */
package controller;

import connect.DBConnect;
import dao.CustomerDao;
import dao.OrderDao;
import dao.OrderDetailDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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

    private CustomerDao ctd = new CustomerDao();

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
                    customer = ctmDao.findById(username, password);

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
        } else if (action.equals("order")) {
            try {
                // kiểm tra nếu người dùng đã đăng nhập thì thêm đơn hàng với idCUstomer là id người dùng đã đn
                String idCustomer = "";
                if (session.getAttribute("Customer") != null) {
                    Customer customer = (Customer) session.getAttribute("Customer");
                    idCustomer = customer.getCustomerID();
                } else {
                    try {
                        String name = (String) session.getAttribute("txtname");
                        String email = (String) session.getAttribute("txtemail");
                        String address = (String) session.getAttribute("txtaddress");
                        String phonenumber = (String) session.getAttribute("txtphonenumber");
                        idCustomer = ctd.sinhMa(ctd.GetUserID());
                        Customer ctm;
                        ctm = new Customer(idCustomer, name, email, address, phonenumber, "", "CrazyClothing", 0, 1);
                        ctd.addUserInfor(ctm);
                        
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                // tạo mới order
                OrderDao odd = new OrderDao();
                Order od = new Order();
                String orderID = DBConnect.sinhMa("Order", "OrderID");
                od.setOrderID(orderID);
                od.setCustomerID(idCustomer);
                od.setTotalMoney((Double) session.getAttribute("totalPrice"));
                od.setTime(Date.valueOf(LocalDate.now()));
                od.setStatus(1);
                odd.addOrder(od);
                
                // Thêm order detail vào CSDL
                OrderDetailDao odtd = new OrderDetailDao();
                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setOrderDetailID(DBConnect.sinhMa("OrderDetail", "OrderDetailID"));
                orderDetail.setOrderID(orderID);
                List<ClothBuy> lst = (ArrayList<ClothBuy>) session.getAttribute("cart");                
                for(ClothBuy clb : lst)
                {
                    orderDetail.setClothID(clb.getCloth().getClothID());
                    orderDetail.setQuantity(clb.getQuantityBuy());
                    odtd.addOrderDetail(orderDetail);
                }
                 
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
