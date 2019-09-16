package com.ranokuhl.warehouse.repositories;

import com.ranokuhl.warehouse.models.Products;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends MongoRepository<Products, String> {
}
