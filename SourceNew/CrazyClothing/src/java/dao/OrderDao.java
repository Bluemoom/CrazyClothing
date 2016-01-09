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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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

    public List<Order> list() throws SQLException, ClassNotFoundException {
        ArrayList<Order> arr = new ArrayList<Order>();
        try {
            Connection conn = DBConnect.getSQLServerConnection();
            String query = "select * from [Order]";
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Order order = new Order();
                order.setOrderID(rs.getString("OrderID"));
                order.setCustomerID(rs.getString("CustomerID"));
                order.setTime(rs.getDate("Time"));
                order.setTotalMoney(rs.getDouble("totalMoney"));
                order.setStatus(rs.getInt("status"));
                arr.add(order);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }

    public void unpublic(String orderID) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnect.getSQLServerConnection();
        String sql = "update [Order] set [status] = 0 where orderID = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, orderID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public String getCustomerID(String orderID) throws SQLException, ClassNotFoundException {
         String customerID = null;
            try {
            Connection conn = DBConnect.getSQLServerConnection();
            String query = "select CustomerID from [Order] where orderID ="+orderID;
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                customerID  = rs.getString("CustomerID");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerID;
     }
     public double getTotalPrice(String orderID) throws ClassNotFoundException
     {
         double money = 0;
            try {
            Connection conn = DBConnect.getSQLServerConnection();
            String query = "select totalMoney from [Order] where orderID ="+orderID;
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                money  = rs.getDouble("totalMoney");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return money;
     }
}
