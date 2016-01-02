/*
 * Thao tác dữ liệu khách
 */
package dao;

import connect.DBConnect;
import controller.RegisterServlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public Customer findById(String username, String password) throws ClassNotFoundException {
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

    public boolean checkPassword(String retypepass, String password) {
        return password.equals(retypepass);
//        if (password.equals(retypepass))
//        {
//            return true;
//        }
//        else
//            return false;
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

    public String GetUserID() throws ClassNotFoundException, SQLException {
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

    public boolean CheckUserInFo(String username) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnect.getSQLServerConnection();
        String sql = "Select username from Customer where username='" + username + "'";
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
}
