package com.ranokuhl.warehouse.controllers;

import com.ranokuhl.warehouse.models.Products;
import com.ranokuhl.warehouse.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public Iterable<Products> list() {
        return productService.list();
    }


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
