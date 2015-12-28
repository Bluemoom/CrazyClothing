/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Cloth;
import model.GroupCloth;


/**
 *
 * @author sunny
 */

// đây: quan trọng nhất là cái này, cái dao này là chỗ ae mình viết phương thức đổ dữ liệu lên giống như phương thức seachByPrice thì bảo vào ClothDao
public class ClothDao {
    public List<Cloth> showSpecialCloth() throws ClassNotFoundException
    {
        ArrayList<Cloth> arr = new ArrayList<Cloth>();
        try {
            Connection conn = DBConnect.getSQLServerConnection();
            String query="select * from Cloth where new = 1";
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
