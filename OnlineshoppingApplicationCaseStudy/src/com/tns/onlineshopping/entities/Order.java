package com.tns.onlineshopping.entities;

import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<ProductQuantityPair> products;
    private String status;

    public Order(int orderId, Customer customer, List<ProductQuantityPair> products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
        this.status = "Pending";
    }
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ProductQuantityPair> getProducts() {
        return products;
    }

    public void setProducts(List<ProductQuantityPair> products) {
        this.products = products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder productList = new StringBuilder();
        for (ProductQuantityPair pair : products) {
            productList.append("Product: ").append(pair.getProduct().getName())
                    .append(", Quantity: ").append(pair.getQuantity()).append("\n");
        }
        return "OrderID: " + orderId + ", Status: " + status + "\n" + productList;
    }
}
