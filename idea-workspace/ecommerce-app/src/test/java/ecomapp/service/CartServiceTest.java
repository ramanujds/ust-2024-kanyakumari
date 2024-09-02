package ecomapp.service;

import ecomapp.exception.ProductNotFoundException;
import ecomapp.model.Clothing;
import ecomapp.model.Product;
import ecomapp.model.Size;
import ecomapp.repository.CartRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CartServiceTest {

//    public void addToCart(Product product) {
//
//        cartRepo.addProduct(product);
//
//    }

    @Mock
    CartRepositoryImpl cartRepository;

    @InjectMocks
    CartServiceImpl cartService;

    @Test
    void testAddToCart() throws ProductNotFoundException {

        // Given
        Product product = new Clothing(10, "T-Shirt", 2000, 10, Size.MEDIUM, "Cotton");

        // When
        Mockito.doNothing().when(cartRepository).addProduct(product);
        Mockito.when(cartRepository.findProduct(product.getProductId())).thenReturn(product);

        // Then
        cartService.addToCart(product);
        Assertions.assertDoesNotThrow(() -> cartService.getProductById(product.getProductId()));

        // Verify
        Mockito.verify(cartRepository, Mockito.times(1)).addProduct(product);


    }


    @Test
    void testGetProductById() throws ProductNotFoundException {

        // Given
        int id = 1;
        Product product = new Clothing(1, "T-Shirt", 2000, 10, Size.MEDIUM, "Cotton");


        // When
        Mockito.when(cartRepository.findProduct(id)).thenReturn(product);

        // Then
        Assertions.assertEquals(product,cartService.getProductById(id));

        // Verify
        Mockito.verify(cartRepository,Mockito.times(1)).findProduct(id);


    }





}
