package com.ranokuhl.warehouse.controllers;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.ranokuhl.warehouse.models.Products;
import com.ranokuhl.warehouse.models.QProducts;
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

    // Query DSL starting here
    @GetMapping("/products/{name}")
    public List<Products> getByName(@PathVariable("name") String name) {

        // Create a new query class QProduct
        QProducts qProducts = new QProducts("name");

        // use the query class and run the filter
        BooleanExpression filterByName = qProducts.products.any().name.eq(name);

//      BooleanExpression filterByName = qProducts.products.get(1).name.eq(name);

        // then pass the filter into the findAll() method
        List<Products> products = (List<Products>) this.productsRepository.findAll(filterByName);

        return products;
    }

//    public List<Products> getName(){
//
//        QProducts qProducts = new QProducts("products");
//
//        BooleanExpression filterByName = qProducts.products.get(0).name.eq()
//    }



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
