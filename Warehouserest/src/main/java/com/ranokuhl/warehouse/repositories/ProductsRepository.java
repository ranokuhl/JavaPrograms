package com.ranokuhl.warehouse.repositories;

import com.ranokuhl.warehouse.models.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepository extends MongoRepository<Products, String> {
}
