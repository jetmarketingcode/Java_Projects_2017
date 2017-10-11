/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vm.dto;

import java.math.BigDecimal;

/**
 *
 * @author apprentice
 */
public class Product {

    String Item;
    BigDecimal Price;
    int Inventory;
    // BigDecimal Cost;

    public Product(String Item, BigDecimal Price, int Inventory) {

        this.Item = Item;
        this.Price = Price;
        this.Inventory = Inventory;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String Item) {
        this.Item = Item;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal Price) {
        this.Price = Price;
    }

    public int getInventory() {
        return Inventory;
    }

    public void setInventory(int Inventory) {
        this.Inventory = Inventory;
    }

    public void removeInventory(String itemName) {

    }

    //  public BigDecimal getCost() {
    //   return this.Cost;
    // }
    @Override
    public String toString() {
        return ": " + Item + " |Price: " + Price + " "
                + "|Inventory: " + Inventory;
    }
}
