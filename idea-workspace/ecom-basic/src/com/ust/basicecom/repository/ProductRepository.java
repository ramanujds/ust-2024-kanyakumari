package com.ust.basicecom.repository;

public class ProductRepository {

    private String []prducts = {"Phone","Laptop","TShirt","Shirt","Watch"};

    public String[] getAllProducts(){
        return prducts;
    }

    public String getProduct(String name){
        for (String product:prducts){
            if (product.equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }



}
