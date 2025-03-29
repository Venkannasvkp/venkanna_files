package com.tns.onlineshopping.services;

import com.tns.onlineshopping.entities.Product;
import com.tns.onlineshopping.entities.Order;
import java.util.List;

public class AdminService {

    
    public void addProduct(List<Product> productList, Product product) {
        productList.add(product);
        System.out.println("Product added successfully!");
    }

    
    public void removeProduct(List<Product> productList, int productId) {
        
    productList.removeIf(product -> product.getProductId() == productId);
       System.out.println("Product removed successfully!");
        
    }
    
    
    public void viewProducts(List<Product> productList) {
        System.out.println("Products:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    
    public void updateOrderStatus(Order order, String newStatus) {
        order.setStatus(newStatus);
        System.out.println("Order status updated to: " + newStatus);
    }

    
    public void viewOrders(List<Order> orderList) 
    {
        System.out.println("Orders:");
        for (Order order : orderList) 
        {
            System.out.println(order);
        }
    }
}
