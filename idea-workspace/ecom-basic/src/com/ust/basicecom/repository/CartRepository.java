package com.ust.basicecom.repository;

public class CartRepository {

    final int MAX_SIZE = 5;
    private String[] cart = new String[MAX_SIZE];
    private ProductRepository productRepository = new ProductRepository();
    int currentIndex=-1;
    public void addToCart(String item){
        if (currentIndex==MAX_SIZE-1){
            System.out.println("Sorry Cart is Full");
            return;
        }
        String product = productRepository.getProduct(item);
        if (product == null) {
            System.out.println("No Product Available with name "+item);
            return;
        }
        cart[++currentIndex]=item;
    }

    public String[] getAllCartItems(){
        return cart;
    }


}
