//package com.ranokuhl.warehouse.services;
//
//import com.ranokuhl.warehouse.models.Products;
//import com.ranokuhl.warehouse.repositories.ProductRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//
//@Service
//public class DataSetReaderProducts implements CommandLineRunner {
//
//    private ProductRepository productRepository;
//    private MongoTemplate mongoTemplate;
//
//    public DataSetReaderProducts(ProductRepository productRepository, MongoTemplate mongoTemplate) {
//        this.productRepository = productRepository;
//        this.mongoTemplate = mongoTemplate;
//    }
//
//    // Dropping the products collection in mongodb
//    @Override
//    public void run(String... args) throws IOException {
//        this.productRepository.deleteAll();
//        this.mongoTemplate.dropCollection(Products.class);
//
//
//
//        // Add data from json file in mongodb
//
//
//
//
//
//
//    }
//
//}
