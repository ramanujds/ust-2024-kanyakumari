package com.ust.basicecom;

import com.ust.basicecom.repository.CartRepository;
import com.ust.basicecom.repository.ProductRepository;

public class Main {

    static void print(String []arr){
        for (String item:arr){
            if(item==null){
                break;
            }
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        CartRepository cartRepo = new CartRepository();

        ProductRepository productRepository = new ProductRepository();

        System.out.println("All Products");
        print(productRepository.getAllProducts());

        cartRepo.addToCart("Phone");
        cartRepo.addToCart("Shirt");
        cartRepo.addToCart("Pen");
        cartRepo.addToCart("Laptop");


        System.out.println("Items in Cart");
        print(cartRepo.getAllCartItems());


    }
}