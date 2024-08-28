package com.ust.ecomapp.repository;

import com.ust.ecomapp.exception.ProductNotFoundException;
import com.ust.ecomapp.model.Product;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartRepositoryImpl implements CartRepository {

    private Map<Integer,Product> products = new HashMap<>();
    int currentIndex = 0;

    public void addProduct(Product product) {
        products.put(product.getProductId(),product);
    }

    public Product findProduct(int id)throws ProductNotFoundException {

        Product product = products.get(id);
        if(product == null)
            throw new ProductNotFoundException("Product with ID : "+id+ " not Found");
        return product;
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }
}
