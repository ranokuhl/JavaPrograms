package com.ranokuhl.warehouse.services;

import com.ranokuhl.warehouse.models.Products;
import com.ranokuhl.warehouse.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<Products> list() {
        return productRepository.findAll();
    }

    public Iterable<Products> save(List<Products> products) {
        return products;
    }

//    public Iterable<Product> save(List<Product> products) {
//        return productRepository.save(products);
//    }
}
