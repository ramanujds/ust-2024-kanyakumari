package com.ust.ecomapp.repository;

import com.ust.ecomapp.model.Product;

public interface CartRepository {

    public void addProduct(Product product);

    public Product findProduct(int id);

    public Product[] getAllProducts();

}
