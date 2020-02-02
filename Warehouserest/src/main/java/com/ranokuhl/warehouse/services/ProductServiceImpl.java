package com.ranokuhl.warehouse.services;

import com.ranokuhl.warehouse.models.Product;
import com.ranokuhl.warehouse.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;


@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private ProductService productService;

    // Mongotemplate get all products
    @Override
    public void addNewProduct(Product product) {
        mongoTemplate.insert(product);
    }



//    public Collection<Product> getAllProductsWithMongoTemplate() {
//        return mongoTemplate.findAll(Product.class);
//    }
}
