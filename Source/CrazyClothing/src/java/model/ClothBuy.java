/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Lớp này là lớp tạo sản phẩm mua gồm thuộc tính sản phẩm và số lượng mua
 */
package model;

/**
 *
 * @author sunny
 */
public class ClothBuy {
    public Cloth cloth;
    private int quantityBuy;

    public ClothBuy() {
    }

    public ClothBuy(Cloth cloth, int quantityBuy) {
        this.cloth = cloth;
        this.quantityBuy = quantityBuy;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    public int getQuantityBuy() {
        return quantityBuy;
    }

    public void setQuantityBuy(int quantityBuy) {
        this.quantityBuy = quantityBuy;
    }
       
    
}
