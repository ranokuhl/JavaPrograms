package com.ranokuhl.warehouse.controllers;

import com.ranokuhl.warehouse.models.Product;
import com.ranokuhl.warehouse.repositories.ProductRepository;
import com.ranokuhl.warehouse.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;



//    ## Methods for Products
    @GetMapping("/product/all")
    public List<Product> findAllProducts() {
        return productService.findAll();
    }

    @RequestMapping(value = "/product/name/{productName}", method = RequestMethod.GET)
    public List<Product> findByName(@PathVariable("productName") String productName) {
        return productRepository.findByName(productName);
    }
}
