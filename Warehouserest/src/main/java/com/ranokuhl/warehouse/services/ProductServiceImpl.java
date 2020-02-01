package com.ranokuhl.warehouse.services;

import com.ranokuhl.warehouse.models.Product;
import com.ranokuhl.warehouse.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private ProductRepository repository;

//    public List<Product> findAll() {
//        return repository.findAll();
//    }

    // Mongotemplate get all products
    public Collection<Product> getAllProductsWithMongoTemplate() {
        return mongoTemplate.findAll(Product.class);
    }
}
