/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.ClothDao;
import dao.CustomerDao;
import dao.GroupClothDao;
import java.io.Console;
import java.sql.SQLException;

/**
 *
 * @author sunny
 */
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        GroupClothDao gcDao = new GroupClothDao();
//        ClothDao cl = new ClothDao();
//        System.out.println(gcDao.GetGroupCloth("100001").getGroupName());
        
        CustomerDao gcDao = new CustomerDao();
        String username = "chuyenlangthang";
        String password = "chuyenlangthang";
        int rs=gcDao.checkLogin(username,password);
        System.out.println(rs);

    }
}
