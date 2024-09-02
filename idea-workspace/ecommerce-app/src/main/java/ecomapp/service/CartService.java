package ecomapp.service;

import ecomapp.exception.ProductNotFoundException;
import ecomapp.model.Product;

import java.util.List;

public interface CartService {

    public void addToCart(Product product);

    public List<Product> getCartItems();

    public double calculateTotalPrice();

    public void applyDiscounts();

    public Product getProductById(int id)throws ProductNotFoundException;

}
