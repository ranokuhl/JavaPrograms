package com.ranokuhl.warehouse.repositories;

import com.ranokuhl.warehouse.models.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Products, String> {
}
