package com.tns.onlineshopping.entities;

import java.util.List;

public class Customer extends User {
    private String address;
    private ShoppingCart shoppingCart;
    private List<Order> orders;

    public Customer(int userId, String username, String email, String address) {
        super(userId, username, email);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) 
    {
        this.shoppingCart = shoppingCart;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
