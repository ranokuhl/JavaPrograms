package com.ranokuhl.warehouse.services;

import com.ranokuhl.warehouse.models.Products;
import com.ranokuhl.warehouse.repositories.ProductsRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    @Autowired
    private ProductsRepository productsRepository;

    public Iterable<Products> list() {
        return productsRepository.findAll();
    }

    public Iterable<Products> save(List<Products> products) {
        return products;
    }

//    public Iterable<Product> save(List<Product> products) {
//        return productsRepository.save(products);
//    }
}
