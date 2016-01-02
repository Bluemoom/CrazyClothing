/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnect;
import controller.RegisterServlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author sunny
 */
public class OrderDao {
    
    public void addOrder(Order od) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnect.getSQLServerConnection();
        String sql = "Insert into [Order] values(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, od.getOrderID());
            ps.setString(2, od.getCustomerID());
            ps.setDate(3, od.getTime());
            ps.setDouble(4, od.getTotalMoney());
            ps.setInt(5, od.getStatus());
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
