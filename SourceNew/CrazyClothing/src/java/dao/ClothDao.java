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
import model.Cloth;
import model.GroupCloth;


/**
 *
 * @author sunny
 */

public class ClothDao {
    public List<Cloth> showSpecialCloth() throws ClassNotFoundException
    {
        ArrayList<Cloth> arr = new ArrayList<Cloth>();
        try {
            Connection conn = DBConnect.getSQLServerConnection();
            String query="select * from Cloth where new = 1 and [status] = 1";
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
    
     public ArrayList<Cloth> showCloth() throws ClassNotFoundException
    {
        ArrayList<Cloth> arr = new ArrayList<Cloth>();
        try {
            Connection conn = DBConnect.getSQLServerConnection();
            String query="select * from Cloth";
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
     
     public ArrayList<Cloth> getListByPage(ArrayList<Cloth> arr,int start,int end)
     {
         ArrayList<Cloth> list = new ArrayList<Cloth>();
         for (int i = start; i < end; i++)
         {
             list.add(arr.get(i));            
         }
         return list;
     }
     
     
    public Cloth ShowDetailCloth(String ClothID) throws ClassNotFoundException
    {       
        Cloth cloth = new Cloth();
        try {
            Connection conn = DBConnect.getSQLServerConnection();           
            String query="select * from Cloth where ClothID='"+ClothID+"'";
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {              
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
            }
            conn.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }     
        return cloth;
    }
    
    public Cloth findById(String ClothID) throws ClassNotFoundException
    {       
        Cloth cloth = new Cloth();
        try {
            Connection conn = DBConnect.getSQLServerConnection();           
            String query="select * from Cloth where ClothID='"+ClothID+"'";
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {              
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
            }
            conn.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }     
        return cloth;
    } 
    
    public ArrayList<Cloth> searchByPrice(double price1, double price2) throws ClassNotFoundException
    {       
         ArrayList<Cloth> arr = new ArrayList<Cloth>();
        try {
            Connection conn = DBConnect.getSQLServerConnection();
            String query="select * from Cloth where price > '"+price1+"' and price < '"+price2+"'";
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
    
    public ArrayList<Cloth> searchByName(String ClothName) throws ClassNotFoundException
    {       
         ArrayList<Cloth> arr = new ArrayList<Cloth>();
        try {
            Connection conn = DBConnect.getSQLServerConnection();
            String query="select * from Cloth where clothName like'%"+ClothName+"%'";
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
    
     public String GetClothID() throws ClassNotFoundException, SQLException {
        Connection conn = DBConnect.getSQLServerConnection();
        String sql = "Select top 1 clothID from Cloth order by clothID desc";
        try {
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                return rs.getString("clothID");
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     

    public void addNewCloth(Cloth cl) throws SQLException, ClassNotFoundException
    {
        Connection conn = DBConnect.getSQLServerConnection();
        try
        {
            PreparedStatement ps = conn.prepareStatement("insert into Cloth values (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, cl.getClothID());
            ps.setString(2, cl.getGroupCloth().getGroupID());
            ps.setString(3, cl.getClothName());
            ps.setString(4, cl.getImage());          
            ps.setInt(5, cl.getQuantity());
            ps.setString(6, cl.getDescription());
            ps.setDouble(7, cl.getPrice());
            ps.setInt(8, cl.getSale());
            ps.setInt(9, cl.getSatus());
            ps.setInt(10, cl.getNeww());
            ps.executeUpdate();
            conn.close();
        }
        catch (Exception ex)
        {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
     public void editCloth(String clothID,GroupCloth groupCloth,String clothName,String image,int quantity,String description,double price,int sale,int status,int neww) throws SQLException, ClassNotFoundException
    {
        Connection conn = DBConnect.getSQLServerConnection();
        String query = "update Cloth set groupClothID=?,clothName=?,image=?,quantity=?,description=?,price=?,sale=?,status=?,new=?"+" where clothID = ?";
        try
        {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, groupCloth.groupID);
            ps.setString(2, clothName);
            ps.setString(3, image);        
            ps.setInt(4, quantity);
            ps.setString(5, description);
            ps.setDouble(6, price);
            ps.setInt(7, sale);
            ps.setInt(8, status);
            ps.setInt(9, neww);
            ps.setString(10, clothID);
            ps.executeUpdate();
            conn.close();
        }
        catch (Exception ex)
        {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);         
        }
    }   
     
      public void delete(String clothID ) throws SQLException, ClassNotFoundException
     {
         Connection conn = DBConnect.getSQLServerConnection();
         String query = "delete Cloth where clothID = ?";
         try
         {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, clothID);
            ps.executeUpdate();
            conn.close();
         }
         catch (Exception ex)
         {
              Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);         
         }        
     }    
}
