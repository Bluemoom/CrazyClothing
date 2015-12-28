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
public class Cloth {
    private String clothID;
    private GroupCloth groupCloth;
    private String clothName;
    private int quantity;
    private String description;
    private double price;
    private int sale;

    public Cloth() {
    }

    public Cloth(String clothID, GroupCloth groupCloth, String clothName, int quantity, String description, double price, int sale) {
        this.clothID = clothID;
        this.groupCloth = groupCloth;
        this.clothName = clothName;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
        this.sale = sale;
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
    
}
