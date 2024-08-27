package com.ust.ecomapp.repository;

import com.ust.ecomapp.exception.ProductNotFoundException;
import com.ust.ecomapp.model.Product;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CartRepositoryImpl implements CartRepository {

    private List<Product> products = new ArrayList<>();
    int currentIndex = 0;

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findProduct(int id)throws ProductNotFoundException {

        for (Product p:products){
            if (p.getProductId()==id){
                return p;
            }
        }
        throw new ProductNotFoundException("Product with ID : "+id+ " not Found");
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
