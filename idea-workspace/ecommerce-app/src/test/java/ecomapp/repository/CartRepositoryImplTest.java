package ecomapp.repository;

import ecomapp.model.Clothing;
import ecomapp.model.Product;
import ecomapp.model.Size;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartRepositoryImplTest {

    @Test
    void testAddProduct(){
        // Given

        Product product = new Clothing(10, "T-Shirt", 2000, 10, Size.MEDIUM, "Cotton");
        CartRepositoryImpl cartRepository = new CartRepositoryImpl();
        // When
        cartRepository.addProduct(product);

        // Then
        Assertions.assertDoesNotThrow(()->cartRepository.findProduct(product.getProductId()));

    }

}
