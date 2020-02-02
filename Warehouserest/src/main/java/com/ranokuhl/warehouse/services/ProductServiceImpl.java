package com.ranokuhl.warehouse.services;

import com.ranokuhl.warehouse.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;


@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private MongoTemplate mongoTemplate;

    // Mongotemplate get all products
    @Override
    public void addNewProduct(Product product) {
        mongoTemplate.insert(product);
    }
//    public Collection<Product> getAllProductsWithMongoTemplate() {
//        return mongoTemplate.findAll(Product.class);
//    }
}
