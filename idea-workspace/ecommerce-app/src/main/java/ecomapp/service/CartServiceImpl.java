package ecomapp.service;

import ecomapp.exception.ProductNotFoundException;
import ecomapp.model.Clothing;
import ecomapp.model.Electronics;
import ecomapp.model.Product;
import ecomapp.repository.CartRepository;
import ecomapp.repository.CartRepositoryImpl;

import java.util.List;

public class CartServiceImpl implements CartService{

    private CartRepository cartRepo;

    public void addToCart(Product product) {
        cartRepo = new CartRepositoryImpl();

        cartRepo.addProduct(product);

    }

    public List<Product> getCartItems() {
        cartRepo = new CartRepositoryImpl();
        return cartRepo.getAllProducts();
    }

    public double calculateTotalPrice() {
        cartRepo = new CartRepositoryImpl();
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
