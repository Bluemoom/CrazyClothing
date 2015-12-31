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
import model.Customer;

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
        Customer ctm = new Customer("2","dat","vandat@gmail.com","","0123456789","aaa","aaa",1,1);
        System.out.print(gcDao.GetUserID());
    }
}
