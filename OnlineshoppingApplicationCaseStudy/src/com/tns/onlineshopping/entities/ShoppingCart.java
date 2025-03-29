package com.tns.onlineshopping.entities;

import java.util.Map;

public class ShoppingCart
{
    private Map<Product, Integer> items; 
    public ShoppingCart(Map<Product, Integer> items) {
        this.items = items;
    }


    public Map<Product, Integer> getItems() {
        return items;
    }

    public void setItems(Map<Product, Integer> items) {
        this.items = items;
    }
}
