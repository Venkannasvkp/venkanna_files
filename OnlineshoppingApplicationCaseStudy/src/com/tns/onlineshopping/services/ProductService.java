package com.tns.onlineshopping.services;

import com.tns.onlineshopping.entities.Product;

import java.util.List;

public class ProductService {

    
    public void addProduct(List<Product> productList, Product product) {
        productList.add(product);
        System.out.println("Product added successfully!");
    }

    
    public void removeProduct(List<Product> productList, int productId) {
        productList.removeIf(product -> product.getProductId() == productId());
        System.out.println("Product removed successfully!");
    }

    private int productId() {
		
		return 0;
	}

	
    public void viewProducts(List<Product> productList) {
        System.out.println("Products:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
