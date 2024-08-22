package com.ust.ecomapp;

import com.ust.ecomapp.model.Clothing;
import com.ust.ecomapp.model.Electronics;
import com.ust.ecomapp.model.Product;
import com.ust.ecomapp.model.Size;
import com.ust.ecomapp.service.CartService;
import com.ust.ecomapp.service.CartServiceImpl;

public class Main {
    public static void main(String[] args) {

        Product ep1 = new Electronics(1,"Macbook",195000,4,1,"Apple");
        Product ep2 = new Electronics(2,"S24 Ultra",150000,5,2,"Samsung");

        Product cp1 = new Clothing(10,"T-Shirt",2000,10, Size.MEDIUM,"Cotton");
        Product cp2 = new Clothing(11,"Jeans",4000,10, Size.LARGE,"Denim");

        CartService cartService = new CartServiceImpl();

        cartService.addToCart(cp1);
        cartService.addToCart(ep1);

        Product []products = cartService.getCartItems();
        System.out.println("Products in Cart : ");
        for (Product p:products){
            if (p==null){
                break;
            }
            p.displayDetails();
        }

        double totalPrice = cartService.calculateTotalPrice();
        System.out.println("Total : "+totalPrice);

        cartService.applyDiscounts();

        double discountedPrice = cartService.calculateTotalPrice();

        System.out.println("After Discounts : "+discountedPrice);

    }
}