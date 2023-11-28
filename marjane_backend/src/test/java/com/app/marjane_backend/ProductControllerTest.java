package com.app.marjane_backend;

import com.app.marjane_backend.Service.ProductService;
import com.app.marjane_backend.entities.Product;
import com.app.marjane_backend.web.ProductController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class ProductControllerTest {

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    @BeforeEach
    void setUp() {
        productService = mock(ProductService.class);
        productController = new ProductController(productService);
    }
    @Test
    void testGetProductById() {
        Long productId = 1L;
        Product product = new Product();
        product.setId(productId);

        when(productService.findById(productId)).thenReturn(Optional.of(product));

        ResponseEntity<Product> responseEntity = productController.getProductById(productId);

         assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(product, responseEntity.getBody());

         verify(productService, times(1)).findById(productId);
    }

    @Test
    void testCreateProduct() {
        Product product = new Product();

        when(productService.creer(any(Product.class))).thenReturn(product);

        Product createdProduct = productController.create(product);

        assertEquals(product, createdProduct);
        verify(productService, times(1)).creer(product);
    }

    @Test
    void testUpdateProduct() {
        Long productId = 1L;
        Product product = new Product();

        when(productService.modifier(eq(productId), any(Product.class))).thenReturn(product);

        Product updatedProduct = productController.update(productId, product);

        assertEquals(product, updatedProduct);
        verify(productService, times(1)).modifier(productId, product);
    }
}
