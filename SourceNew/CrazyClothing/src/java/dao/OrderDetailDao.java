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

    public List<OrderDetail> showOrderDetail(String orderID) throws SQLException, ClassNotFoundException {
        ArrayList<OrderDetail> arr = new ArrayList<OrderDetail>();
        try {
            Connection conn = DBConnect.getSQLServerConnection();
            String query = "select * from [OrderDetail] where orderID =" + orderID;
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setOrderID(rs.getString("OrderID"));
                orderDetail.setOrderDetailID(rs.getString("OrderDetailID"));
                orderDetail.setClothID(rs.getString("ClothID"));
                orderDetail.setQuantity(rs.getInt("Quantity"));
                arr.add(orderDetail);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }
}
