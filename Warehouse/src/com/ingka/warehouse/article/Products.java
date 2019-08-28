package com.ingka.warehouse.article;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Products {


    private List products;
    private String name;
//    private String[] contain_articles;
//    private Article article;

    public Products() {

    }

    public Products(List products, String name) {
        this.products = products;
        this.name = name;
    }

    public List getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public void setProducts(List products) {
        this.products = products;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return getName() +  getProducts();
//    }
}
