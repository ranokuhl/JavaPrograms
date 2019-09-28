package com.ranokuhl.warehouse.repositories;

import com.ranokuhl.warehouse.models.Products;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends MongoRepository<Products, String>, QuerydslPredicateExecutor<Products> {
//    List<Products> findByName(String name);

    // Starting advanced @Query filter
    @Query(value = "{}")
    List<Products> findByName(String name);
}
