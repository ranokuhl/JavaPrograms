package com.ranokuhl.warehouse.controllers;

import com.ranokuhl.warehouse.models.Product;
import com.ranokuhl.warehouse.repositories.ProductRepository;
import com.ranokuhl.warehouse.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //    ## Methods for Products
    //    @GetMapping("/product/all")
    //    public List<Product> findAllProducts() {
    //        return productService.findAll();
    //    }
    // Find all products
    @GetMapping("/product/all")
    public Collection<Product> findAll() {
        return productRepository.findAll();
    }

    // Find product by Name
    @GetMapping("/product/name/{name}")
    public List<Product> findByName(@PathVariable("name") String name) {
        return productRepository.findByName(name);
    }

    // Find product by Id
    @GetMapping("/product/{id}")
    public Product productById(@PathVariable("id") String id) {
        return productRepository.findById(id).orElse(null);
    }

    // Delete product
    @DeleteMapping("/product/delete/{id}")
    public void deleteProduct(@PathVariable("id") String id) {
        productRepository.deleteById(id);
    }

    // ##### Methods with MongoTemplate ####
    @PostMapping(value = "/product/add")
    public void addNewProduct(@RequestBody Product product) {
        productService.addNewProduct(product);
    }


//    @GetMapping("/products")
//    public Collection<Product> getAllProductsWithMongoTemplate() {
//        return productService.getAllProductsWithMongoTemplate();
//    }
}
