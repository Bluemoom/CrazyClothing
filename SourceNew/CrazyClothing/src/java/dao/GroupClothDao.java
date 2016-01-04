/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.GroupCloth;
import connect.DBConnect;
import controller.RegisterServlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String srtQuery = "select * from GroupCloth";
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(srtQuery);
        while (rs.next()) {
            GroupCloth temp = new GroupCloth();
            temp.setGroupID(rs.getString("GroupID"));
            temp.setGroupName(rs.getString("GroupName"));
            temp.setImage(rs.getString("image"));
            temp.setGroupTop(rs.getString("GroupTop"));
            arr.add(temp);
         } 
            conn.close();
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
    
    public GroupCloth GetGroupCloth(String GroupID) throws SQLException, ClassNotFoundException
    {
        GroupCloth temp = new GroupCloth();
        try
        {
        Connection conn = DBConnect.getSQLServerConnection();
        Statement stmt = null;
        String srtQuery = "select * from GroupCloth where groupID='"+GroupID+"'";
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(srtQuery);
        while (rs.next()) {           
            temp.setGroupID(rs.getString("GroupID"));
            temp.setGroupName(rs.getString("GroupName"));
            temp.setImage(rs.getString("image"));
            temp.setGroupTop(rs.getString("GroupTop"));           
         } conn.close();
        }
        catch(SQLException e)
        {
            e.getStackTrace();
        }
        return temp;
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
    
     public String GetgroupID() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnect.getSQLServerConnection();
        String sql = "Select top 1 groupID from GroupCloth order by groupID desc";
        try {
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                return rs.getString("groupID");
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
  
    
     public void addNewGroupCloth(GroupCloth gr) throws SQLException, ClassNotFoundException
    {
        Connection conn = DBConnect.getSQLServerConnection();
        try
        {
            PreparedStatement ps = conn.prepareStatement("insert into GroupCloth values (?,?,?,?)");
            ps.setString(1, gr.getGroupID());
            ps.setString(2, gr.getGroupName());
            ps.setString(3, gr.getImage());
            ps.setString(4, gr.getGroupTop());
            ps.executeUpdate();
            conn.close();
        }
        catch (Exception ex)
        {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
  
     public void editGroupCloth(String groupID,String groupName,String image,String groupTop) throws SQLException, ClassNotFoundException
    {
        Connection conn = DBConnect.getSQLServerConnection();
        String query = "update GroupCloth set groupName=?,image=?,groupTop=?"+" where groupID = ?";
        try
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, groupName);
            ps.setString(2, image);
            ps.setString(3, groupTop);
            ps.setString(4, groupID);
            ps.executeUpdate();
            conn.close();
        }
        catch (Exception ex)
        {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);         
        }
    }   
     
     public void delete(String groupID ) throws SQLException, ClassNotFoundException
     {
         Connection conn = DBConnect.getSQLServerConnection();
         String query = "delete GroupCloth where groupID = ?";
         try
         {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, groupID);
            ps.executeUpdate();
            conn.close();
         }
         catch (Exception ex)
         {
              Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);         
         }
         
     }
     
}
