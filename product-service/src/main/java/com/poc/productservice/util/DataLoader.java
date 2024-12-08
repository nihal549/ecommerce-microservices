package com.poc.productservice.util;

import com.poc.productservice.model.Product;
import com.poc.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        if (productRepository.count() < 1) {
            Product product = new Product();
            product.setName("container_1");
            product.setDescription("test_container");
            product.setPrice(BigDecimal.valueOf(1000));

            productRepository.save(product);
        }
    }
}
