package com.ust.ecomapp.service;

import com.ust.ecomapp.exception.ProductNotFoundException;
import com.ust.ecomapp.model.Clothing;
import com.ust.ecomapp.model.Electronics;
import com.ust.ecomapp.model.Product;
import com.ust.ecomapp.repository.CartRepository;
import com.ust.ecomapp.repository.CartRepositoryImpl;

import java.util.List;

public class CartServiceImpl implements CartService{

    private CartRepository cartRepo = new CartRepositoryImpl();

    public void addToCart(Product product) {

        cartRepo.addProduct(product);

    }

    public List<Product> getCartItems() {
        return cartRepo.getAllProducts();
    }

    public double calculateTotalPrice() {
        List<Product> products = cartRepo.getAllProducts();
        double total = 0;
        for (Product p:products){
            total+=p.getPrice();
        }
        return total;
    }

    public void applyDiscounts() {
        List<Product> products  = cartRepo.getAllProducts();
        for (Product p:products){
            if (p instanceof Electronics){
                double price = p.getPrice();
                price = price - price*.10;
                p.setPrice(price);
            } else if (p instanceof Clothing) {
                double price = p.getPrice();
                price = price - price*.20;
                p.setPrice(price);
            }
        }
    }

    @Override
    public Product getProductById(int id)throws ProductNotFoundException {
        return cartRepo.findProduct(id);
    }
}
