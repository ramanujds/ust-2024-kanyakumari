package ecomapp.repository;

import ecomapp.exception.ProductNotFoundException;
import ecomapp.model.Product;

import java.util.List;

public interface CartRepository {

    public void addProduct(Product product);

    public Product findProduct(int id) throws ProductNotFoundException;

    public List<Product> getAllProducts();

}
