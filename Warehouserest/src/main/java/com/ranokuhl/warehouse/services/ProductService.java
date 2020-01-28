package com.ranokuhl.warehouse.services;

import com.ranokuhl.warehouse.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public interface ProductService {
    List<Product> findAll();

}
