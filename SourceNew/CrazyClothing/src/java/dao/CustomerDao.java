package dao;

import connect.DBConnect;
import controller.RegisterServlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author sunny
 */
public class CustomerDao {

    public int checkLogin(String username, String password) throws SQLException, ClassNotFoundException {
        int rule = -1;
        String query = "select [rule] from Customer where username ='" + username + "' and [password]='" + password + "' and [status] =1";
        Connection conn = DBConnect.getSQLServerConnection();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(query);
        while (rs.next()) {
            rule = rs.getInt("rule");
        }
        stm.close();
        return rule;
    }

    public Customer findByAccount(String username, String password) throws ClassNotFoundException {
        Customer ctm = new Customer();
        try {
            Connection conn = DBConnect.getSQLServerConnection();
            String query = "select * from Customer where username ='" + username + "' and [password]='" + password + "' and [status] =1";
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                ctm.setCustomerID(rs.getString("CustomerID"));
                ctm.setCustomerName(rs.getString("CustomerName"));
                ctm.setEmail(rs.getString("Email"));
                ctm.setAddress(rs.getString("Address"));
                ctm.setPhoneNumber(rs.getString("PhoneNumber"));
                ctm.setUsername(rs.getString("Username"));
                ctm.setPassword(rs.getString("Password"));
                ctm.setStatus(rs.getInt("Status"));
                ctm.setRule(rs.getInt("Rule"));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ctm;
    }
    
    public Customer findById(String customerID) throws ClassNotFoundException {
        Customer ctm = new Customer();
        try {
            Connection conn = DBConnect.getSQLServerConnection();
            String query = "select * from Customer where customerID ="+customerID;
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                ctm.setCustomerID(rs.getString("CustomerID"));
                ctm.setCustomerName(rs.getString("CustomerName"));
                ctm.setEmail(rs.getString("Email"));
                ctm.setAddress(rs.getString("Address"));
                ctm.setPhoneNumber(rs.getString("PhoneNumber"));
                ctm.setUsername(rs.getString("Username"));
                ctm.setPassword(rs.getString("Password"));
                ctm.setStatus(rs.getInt("Status"));
                ctm.setRule(rs.getInt("Rule"));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ctm;
    }

    public boolean checkPassword(String retypepass, String password) {
        return password.equals(retypepass);
    }

    public String sinhMa(String _matruoc) {
        String maMoi = "";

        if (_matruoc == null || _matruoc == "") {
            _matruoc = "100000";

        } else if (_matruoc == "999999") {
            return null;
        }
        maMoi = Integer.toString(Integer.parseInt(_matruoc) + 1);
        return maMoi;
    }

    public String getUserID() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnect.getSQLServerConnection();
        String sql = "Select top 1 customerID from Customer order by customerID desc";
        try {
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                return rs.getString("customerID");
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean checkUserInFo(String username) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnect.getSQLServerConnection();
        String sql = "Select username from Customer where username='"+username+"'";
        try {
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                return true;
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void addUserInfor(Customer ctm) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnect.getSQLServerConnection();
        String sql = "Insert into Customer values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ctm.getCustomerID());
            ps.setString(2, ctm.getCustomerName());
            ps.setString(3, ctm.getEmail());
            ps.setString(4, ctm.getAddress());
            ps.setString(5, ctm.getPhoneNumber());
            ps.setString(6, ctm.getUsername());
            ps.setString(7, ctm.getPassword());
            ps.setInt(8, ctm.getRule());
            ps.setInt(9, ctm.getStatus());
            ps.executeUpdate();
            System.out.println("<script language='javascript'>alert('Thêm mới thành công!')</script>");
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void EditCustomer(Customer ctm) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnect.getSQLServerConnection();
        String sql ="update Customer\n" +
                    "set customerName = ?, email = ?, [address]=?, phoneNumber=?, username=?, [password]=?, [rule] = ?, [status] =? \n" +
                    "where CustomerID = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);            
            ps.setString(1, ctm.getCustomerName());
            ps.setString(2, ctm.getEmail());
            ps.setString(3, ctm.getAddress());
            ps.setString(4, ctm.getPhoneNumber());
            ps.setString(5, ctm.getUsername());
            ps.setString(6, ctm.getPassword());
            ps.setInt(7, ctm.getRule());
            ps.setInt(8, ctm.getStatus());
            ps.setString(9, ctm.getCustomerID());
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public ArrayList<Customer> list() throws ClassNotFoundException
    {
        ArrayList<Customer> arr = new ArrayList<Customer>();
        try {
            Connection conn = DBConnect.getSQLServerConnection();
            String query="select * from Customer where [rule] = 0 or [rule] = 1";
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                Customer customer = new Customer();
                customer.setCustomerID(rs.getString("CustomerID"));               
                customer.setCustomerName(rs.getString("CustomerName"));
                customer.setEmail(rs.getString("Email"));
                customer.setAddress(rs.getString("Address"));
                customer.setPhoneNumber(rs.getString("PhoneNumber"));
                customer.setUsername(rs.getString("Username"));
                customer.setPassword(rs.getString("Password"));
                customer.setRule(rs.getInt("Rule"));
                customer.setStatus(rs.getInt("status"));                
                arr.add(customer);
            }
            conn.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }
    
    public void unpublic(String customerID) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnect.getSQLServerConnection();
        String sql = "update [Customer] set [status] = 0 where customerID = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, customerID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
