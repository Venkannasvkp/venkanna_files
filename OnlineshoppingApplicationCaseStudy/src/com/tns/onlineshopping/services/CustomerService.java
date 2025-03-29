package com.tns.onlineshopping.services;
import com.tns.onlineshopping.entities.Customer;
import com.tns.onlineshopping.entities.Product;
import com.tns.onlineshopping.entities.ProductQuantityPair;
import com.tns.onlineshopping.entities.Order;

import java.util.List;
import java.util.ArrayList;
public class CustomerService {

    public void createCustomer(List<Customer> customerList, int userId, String username, String email, String address) {
        Customer newCustomer = new Customer(userId, username, email, address);
        customerList.add(newCustomer);
        System.out.println("Customer created successfully!");
    }

    public void viewCustomers(List<Customer> customerList) {
        System.out.println("Customers:");
        for (Customer customer : customerList) {
            System.out.println("User ID: " + customer.getUserId() + ", Username: " + customer.getUsername() +
                    ", Email: " + customer.getEmail() + ", Address: " + customer.getAddress());
        }
    }

   
    public void viewProducts(List<Product> productList) {
        System.out.println("Products:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void placeOrder(Customer customer, List<Product> productList, List<Order> orderList) {
      
        ArrayList<ProductQuantityPair> orderItems = new ArrayList<>();

        Product product1 = productList.get(0);  
        orderItems.add(new ProductQuantityPair(product1, 2));  
        Order newOrder = new Order(orderList.size() + 1, customer, orderItems);
        orderList.add(newOrder);

        System.out.println("Order placed successfully!");
    }

    public void viewOrders(Customer customer) {
        System.out.println("Orders for Customer: " + customer.getUsername());
        for (Order order : customer.getOrders()) {
            System.out.println(order);
        }
    }
}
