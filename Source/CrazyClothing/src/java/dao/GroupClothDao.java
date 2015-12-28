/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.GroupCloth;
import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sunny
 */
public class GroupClothDao {
    public ArrayList<GroupCloth> showDanhMuc() throws SQLException, ClassNotFoundException
    {
        
        ArrayList<GroupCloth> arr= new ArrayList<GroupCloth>();
        try
        {
        Connection conn = DBConnect.getSQLServerConnection();
        Statement stmt = null;
        String srtQuery = "select * from GroupCloth where groupTop is null";
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(srtQuery);
        while (rs.next()) {
            GroupCloth temp = new GroupCloth();
            temp.setGroupID(rs.getString("GroupID"));
            temp.setGroupName(rs.getString("GroupName"));
            temp.setImage(rs.getString("image"));
            temp.setGroupTop(rs.getString("GroupTop"));
            arr.add(temp);
         } conn.close();
        }
        catch(SQLException e)
        {
            e.getStackTrace();
        }
        return arr;
    }    
}
