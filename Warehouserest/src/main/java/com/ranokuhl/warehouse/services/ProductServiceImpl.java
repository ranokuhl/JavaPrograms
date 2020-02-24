package com.ranokuhl.warehouse.services;

import com.ranokuhl.warehouse.models.Parts;
import com.ranokuhl.warehouse.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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

    @Override
    public Product findByArticleId(String art_id) {
        Query query = new Query();

        // queries articleId in Product collection
        query.addCriteria(Criteria.where("parts.articleId").is(art_id));

        return mongoTemplate.findOne(query, Product.class);
    }





//    public Collection<Product> getAllProductsWithMongoTemplate() {
//        return mongoTemplate.findAll(Product.class);
//    }
}
