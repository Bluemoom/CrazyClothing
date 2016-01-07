/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.sun.javafx.scene.layout.region.Margins;
import com.sun.xml.internal.ws.commons.xmlutil.Converter;
import connect.DBConnect;
import dao.ClothDao;
import dao.CustomerDao;
import dao.GroupClothDao;
import java.io.Console;
import java.sql.SQLException;
import model.GroupCloth;

/**
 *
 * @author sunny
 */
public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        GroupClothDao gcDao = new GroupClothDao();
        GroupCloth gr = new GroupCloth(gcDao.sinhMa(gcDao.GetgroupID()),"Khăng Quàng Cổ","","");
//        System.out.println(gcDao.GetGroupCloth("100001").getGroupName());

//        CustomerDao gcDao = new CustomerDao();
//        String username = "chuyenlangthang";
//        String password = "chuyenlangthang";
//        int rs=gcDao.checkLogin(username,password);
//        int i = 999999;
          System.out.println(DBConnect.sinhMa("[Order]", "OrderID"));

    }
}
