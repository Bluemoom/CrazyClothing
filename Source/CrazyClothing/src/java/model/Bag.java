/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.ClothDao;
import java.util.ArrayList;

/**
 *
 * @author sunny
 */
public class Bag {
    private ArrayList<Cloth> list;
    private double totalMoney;

    public Bag(ArrayList<Cloth> list, double totalMoney) {
        this.list = list;
        this.totalMoney = totalMoney;
    }

    public Bag() {
        list = new ArrayList<Cloth>();
        totalMoney = 0;
    }

    public ArrayList<Cloth> getList() {
        return list;
    }

    public void setList(ArrayList<Cloth> list) {
        this.list = list;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

//    public void addCloth(String clothID)
//    {
//        
//        ClothDao cld = new ClothDao();
//        Cloth cloth = cld.FinClothByID(clothID);
//        Boolean bln = list.contains(cloth);
//        if(bln) {
//            cloth.setQuantity(cloth.getQuantity()+1);
//        }
//        list.add(cld.FinClothByID(clothID));
//    }
    
}
