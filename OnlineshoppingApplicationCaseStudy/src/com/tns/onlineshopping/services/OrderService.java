package com.tns.onlineshopping.services;

import com.tns.onlineshopping.entities.Order;
import com.tns.onlineshopping.entities.ProductQuantityPair;

import java.util.List;

public class OrderService 
      {
    public Order createOrder(int orderId, List<ProductQuantityPair> products) {
        Order newOrder = new Order(orderId, null, products);
        return newOrder;
    }

    
    public void updateOrderStatus(Order order, String status) {
        order.setStatus(status);
        System.out.println("Order " + order.getOrderId() + " status updated to " + status);
    }
}
