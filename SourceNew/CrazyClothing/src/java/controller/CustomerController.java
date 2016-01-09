
package controller;

import com.sun.xml.internal.ws.commons.xmlutil.Converter;
import connect.DBConnect;
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
import model.Customer;


public class CustomerController extends HttpServlet {   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        CustomerDao customerDao = new CustomerDao();
        Customer customer = new Customer();
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        String action = request.getParameter("action");
        String url = "Employee.jsp";
        
         if (action.equals("LƯU")) {
            try {
                if (session.getAttribute("customerEdit") != null) {
                customer = (Customer) session.getAttribute("customerEdit");                    
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                String phone = request.getParameter("phonenumber");
                String username = (String) request.getParameter("username");
                String password = (String) request.getParameter("password");
                int rule = Integer.parseInt(request.getParameter("rule"));
                int status = Integer.parseInt(request.getParameter("status"));                
                Customer temp= new Customer(customer.getCustomerID(), name, email, address, phone, username, password, rule, status);
                customerDao.EditCustomer(temp);
                
                session.removeAttribute("customerEdit");                
                response.sendRedirect("Employee.jsp");
                
                }
                else {
                String id = DBConnect.sinhMa("Customer", "CustomerID");
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                String phone = request.getParameter("phonenumber");
                String username = (String) request.getParameter("username");
                String password = (String) request.getParameter("password");
                int rule = Integer.parseInt(request.getParameter("rule"));
                int status = Integer.parseInt(request.getParameter("status"));
                
                customer= new Customer(id, name, email, address, phone, username, password, rule, status);
                customerDao.addUserInfor(customer);
                
                response.sendRedirect("Employee.jsp");
                }
                
                        } catch (SQLException ex) {
                Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
     else if(action.equals("Sua")) {
            try {
                String customerID = request.getParameter("customerID");
                session.setAttribute("customerEdit", customerDao.findById(customerID));
                 RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
            }
    } else if(action.equals("Khoa")) {
            try {
                String customerID = request.getParameter("customerID");
                customerDao.unpublic(customerID);
                response.sendRedirect("Employee.jsp");
                
            } catch (SQLException ex) {
                Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
}