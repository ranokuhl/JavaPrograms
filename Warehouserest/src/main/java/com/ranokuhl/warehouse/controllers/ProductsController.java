package com.ranokuhl.warehouse.controllers;

import com.ranokuhl.warehouse.models.Products;
import com.ranokuhl.warehouse.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping(value = "/api/v1")
public class ProductsController {

//    @Autowired
//    private MongoTemplate mongoTemplate;

    @Autowired
    private ProductsRepository productsRepository;

    @GetMapping("/products/all")
    public List<Products> getAll() {
        List<Products> products = this.productsRepository.findAll();
        return products;
    }

    @PutMapping
    public void insert(@RequestBody Products product) {
        this.productsRepository.insert(product);
    }

    @PostMapping
    public void update(@RequestBody Products product) {
        this.productsRepository.save(product);
    }



    // starting advanced filters

//    private ProductService productService;
//
//    public ProductsController(ProductService productService) {
//        this.productService = productService;
//    }
//
//    @GetMapping("/products")
//    public Iterable<Products> list() {
//        return productService.list();
//    }
//
//




    //    public List<Products> getAllProducts() {
//        return productsRepository.findAll();
//    }

//
//    @GetMapping("/products/all")
//    public Collection<Products> all() {
//        Sort sortByNameAsc = Sort.by("name").ascending();
//        Collection<Products> products = this.productsRepository.findAll(sortByNameAsc);
//        return products;
//    }
//
//    @GetMapping("/product/{id}")
//    public Products byId(@PathVariable String id) {
//        Products product = this.productsRepository.findById("art_id").orElse(null);
//        return product;
//    }
}
