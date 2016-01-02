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
public class OrderDetailDao {
    
    public void addOrderDetail(OrderDetail odt) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnect.getSQLServerConnection();
        String sql = "Insert into OrderDetail values(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, odt.getOrderDetailID());
            ps.setString(2, odt.getOrderID());
            ps.setString(3, odt.getClothID());
            ps.setInt(4, odt.getQuantity());
            ps.executeUpdate();            
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
