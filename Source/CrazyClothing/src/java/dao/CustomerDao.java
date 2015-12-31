/*
 * Thao tác dữ liệu khách
 */
package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.*;

/**
 *
 * @author sunny
 */
public class CustomerDao {
    
    public int checkLogin(String username, String password) throws SQLException, ClassNotFoundException{
        int rule=-1;
        String query = "select [rule] from Customer where username ='"+username+"' and [password]='"+password+"' and [status] =1";
        Connection conn = DBConnect.getSQLServerConnection();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(query);
        while(rs.next()){
            rule=rs.getInt("rule");
        }
        stm.close();
        return rule;
    }
    
    public Customer findById(String username,String password) throws ClassNotFoundException
    {       
       Customer ctm = new Customer();
        try {
            Connection conn = DBConnect.getSQLServerConnection();           
            String query="select * from Customer where username ='"+username+"' and [password]='"+password+"' and [status] =1";
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {              
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
        }
        catch(SQLException e) {
            e.printStackTrace();
        }     
        return ctm;
    }
}
