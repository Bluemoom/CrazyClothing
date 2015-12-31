/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sunny
 */
public class Cloth implements Comparable<Cloth>{
    private String clothID;
    private GroupCloth groupCloth;
    private String clothName;
    private String image;
    private int quantity;
    private String description;
    private double price;
    private int sale;
    private int satus;
    private int neww;

    public Cloth() {
    }

    public Cloth(String clothID, GroupCloth groupCloth, String clothName, String image, int quantity, String description, double price, int sale, int satus, int neww) {
        this.clothID = clothID;
        this.groupCloth = groupCloth;
        this.clothName = clothName;
        this.image = image;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
        this.sale = sale;
        this.satus = satus;
        this.neww = neww;
    }

    public String getClothID() {
        return clothID;
    }

    public void setClothID(String clothID) {
        this.clothID = clothID;
    }

    public GroupCloth getGroupCloth() {
        return groupCloth;
    }

    public void setGroupCloth(GroupCloth groupCloth) {
        this.groupCloth = groupCloth;
    }

    public String getClothName() {
        return clothName;
    }

    public void setClothName(String clothName) {
        this.clothName = clothName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getSatus() {
        return satus;
    }

    public void setSatus(int satus) {
        this.satus = satus;
    }

    public int getNeww() {
        return neww;
    }

    public void setNeww(int neww) {
        this.neww = neww;
    }

    @Override
    public int compareTo(Cloth cloth) {
       return Integer.parseInt(this.clothID) - Integer.parseInt(cloth.clothID);
    } 

}
