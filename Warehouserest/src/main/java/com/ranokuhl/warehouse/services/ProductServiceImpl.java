package com.ranokuhl.warehouse.services;

import com.ranokuhl.warehouse.models.Product;
import com.ranokuhl.warehouse.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

//    public List<Product> findByName() {
//        return repository.findByName();
//    }

}
