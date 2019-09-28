package com.ranokuhl.warehouse.repositories;

import com.ranokuhl.warehouse.models.Products;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends MongoRepository<Products, List> {
//    List<Products> findByName(String name);

    // Starting advanced @Query filter
//    @Query(value = "{}")
//    List<Products> findByName(String name);
}
