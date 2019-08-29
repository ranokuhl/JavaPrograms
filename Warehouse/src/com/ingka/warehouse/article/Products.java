package com.ingka.warehouse.article;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Products {


    private List products;
    private String name;

    public Products() {}

    public Products(List products, String name) {
        this.products = products;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(List products) {
        this.products = products;
    }
}
