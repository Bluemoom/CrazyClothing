/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.TreeMap;

/**
 *
 * @author Mr_Dat
 */
public class Card {
    private TreeMap<Cloth, Integer> list;
     private long CardID;
     
    public Card() {
      list = new TreeMap<Cloth, Integer>();
      CardID = System.currentTimeMillis();
    }  
    public Card(TreeMap<Cloth, Integer> list, long CardID) {
        this.list = list;
        this.CardID = CardID;
    }

    public TreeMap<Cloth, Integer> getList() {
        return list;
    }

    public void setList(TreeMap<Cloth, Integer> list) {
        this.list = list;
    }

    public long getCardID() {
        return CardID;
    }

    public void setCardID(long CardID) {
        this.CardID = CardID;
    }
   
    public void InsertToCard(Cloth cloth,int quantity)
    {
        boolean bl = list.containsKey(cloth);
        if (bl)
        {
            int quan = list.get(cloth);
            quantity += quan;
            list.put(cloth, quantity);
        }
        else
        {
            list.put(cloth, quantity);
        }
    }
    
}
