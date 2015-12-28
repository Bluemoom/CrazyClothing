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
import java.util.List;
import model.Cloth;

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
    
    public List<Cloth> showClothByGroup(String GroupID) throws ClassNotFoundException
    {
        ArrayList<Cloth> arr = new ArrayList<Cloth>();
        try {
            Connection conn = DBConnect.getSQLServerConnection();
            String query="select * from Cloth where groupClothID ="+GroupID;
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                Cloth cloth = new Cloth();
                cloth.setClothID(rs.getString("ClothID"));
                GroupCloth temp = new GroupCloth(rs.getString("GroupClothID"),"","","");
                cloth.setGroupCloth(temp);
                cloth.setClothName(rs.getString("ClothName"));
                cloth.setImage(rs.getString("image"));
                cloth.setDescription(rs.getString("description"));
                cloth.setQuantity(rs.getInt("quantity"));
                cloth.setPrice(rs.getDouble("price"));
                cloth.setSale(rs.getInt("sale"));
                cloth.setSatus(rs.getInt("status"));
                cloth.setNeww(rs.getInt("new"));
                arr.add(cloth);
            }
            conn.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }
}
