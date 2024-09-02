package ecomapp;

import ecomapp.model.Clothing;
import ecomapp.model.Electronics;
import ecomapp.model.Product;
import ecomapp.model.Size;
import ecomapp.service.CartService;
import ecomapp.service.CartServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product ep1 = new Electronics(1, "Macbook", 195000, 4, 1, "Apple");
        Product ep2 = new Electronics(2, "S24 Ultra", 150000, 5, 2, "Samsung");

        Product cp1 = new Clothing(10, "T-Shirt", 2000, 10, Size.MEDIUM, "Cotton");
        Product cp2 = new Clothing(11, "Jeans", 4000, 10, Size.LARGE, "Denim");


//
//
        CartService cartService = new CartServiceImpl();

        cartService.addToCart(cp1);
        cartService.addToCart(ep1);
        cartService.addToCart(ep2);
        cartService.addToCart(cp2);

        List<Product> products =  cartService.getCartItems();
        products.sort((p1,p2)->Double.compare(p1.getPrice(),p2.getPrice()));
       products.forEach(p-> System.out.println(p));

//
//        try {
//            Product product = cartService.getProductById(100);
//            product.displayDetails();
//        } catch (ProductNotFoundException ex) {
//            System.err.println(ex.getMessage());
//        }
//
//
//
//        List<Product> products  = cartService.getCartItems();
//        System.out.println("Products in Cart : ");
//        for (Product p:products){
//
//            p.displayDetails();
//        }
//
//
//
//        double totalPrice = cartService.calculateTotalPrice();
//        System.out.println("Total : "+totalPrice);
//
//        cartService.applyDiscounts();
//
//        System.out.println("After Discounts : ");
//        products = cartService.getCartItems();
//        System.out.println("Products in Cart : ");
//        for (Product p:products){
//            if (p==null){
//                break;
//            }
//            p.displayDetails();
//        }
//
//        double discountedPrice = cartService.calculateTotalPrice();
//
//        System.out.println("After Discounts : "+discountedPrice);

    }
}