package com.ranokuhl.warehouse.controllers;

import com.ranokuhl.warehouse.models.Products;
import com.ranokuhl.warehouse.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class ProductController {

    @Autowired
    private ProductsRepository productsRepository;

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }


}
