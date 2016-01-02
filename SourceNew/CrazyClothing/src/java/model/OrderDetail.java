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
public class OrderDetail {

    private String orderDetailID;
    private String orderID;
    private String clothID;
    private int quantity;

    public OrderDetail() {
    }

    public OrderDetail(String orderDetailID, String orderID, String clothID, int quantity) {
        this.orderDetailID = orderDetailID;
        this.orderID = orderID;
        this.clothID = clothID;
        this.quantity = quantity;
    }

    public String getOrderDetailID() {
        return orderDetailID;
    }

    public void setOrderDetailID(String orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getClothID() {
        return clothID;
    }

    public void setClothID(String clothID) {
        this.clothID = clothID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
