package com.ranokuhl.warehouse.services;

import com.ranokuhl.warehouse.models.Parts;
import com.ranokuhl.warehouse.models.Product;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service("productService")
public interface ProductService {
    void addNewProduct(Product product);

    Product findByArticleId(String art_id);


//    List<Product> findAll();
//    Collection<Product> getAllProductsWithMongoTemplate();


}
