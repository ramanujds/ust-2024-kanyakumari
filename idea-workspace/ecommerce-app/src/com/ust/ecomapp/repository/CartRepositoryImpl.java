package com.ust.ecomapp.repository;

import com.ust.ecomapp.model.Product;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CartRepositoryImpl implements CartRepository {

    private Product []products = new Product[10];
    int currentIndex = 0;

    public void addProduct(Product product) {

        products[currentIndex]=product;
        currentIndex++;

    }

    public Product findProduct(int id) {

        for (Product p:products){
            if (p==null){
                break;
            }
            if (p.getProductId()==id){
                return p;
            }
        }
        return null;
    }

    public Product[] getAllProducts() {
        return products;
    }
}
