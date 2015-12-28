/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.ClothDao;
import dao.GroupClothDao;
import java.sql.SQLException;

/**
 *
 * @author sunny
 */
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ClothDao gcDao = new ClothDao();
        System.out.println(gcDao.showSpecialCloth().size());
    }
}
