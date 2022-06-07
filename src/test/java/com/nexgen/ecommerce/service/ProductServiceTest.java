package com.nexgen.ecommerce.service;

import com.nexgen.ecommerce.dto.product.ProductDto;
import com.nexgen.ecommerce.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService = new ProductService() ;

    @Test
    public void listProducts() {
        List<ProductDto> products = productService.listProducts();
        assertEquals(0, products.size());
    }
}