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
    private Order order;
    private Cloth cloth;
    private int quantity;

    public OrderDetail() {
    }

    public OrderDetail(String orderDetailID, Order order, Cloth cloth, int quantity) {
        this.orderDetailID = orderDetailID;
        this.order = order;
        this.cloth = cloth;
        this.quantity = quantity;
    }

    public String getOrderDetailID() {
        return orderDetailID;
    }

    public void setOrderDetailID(String orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
