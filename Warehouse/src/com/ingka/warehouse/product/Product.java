package com.ingka.warehouse.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;
import flexjson.JSON;

import java.util.List;

// is Articles.java

public class Product {

    private String name;
    private List<ProductContainArticles> productContainArticles;

    public Product() {

    }

    public static Product of(String name, List<ProductContainArticles> productContainArticles) {
        Product product = new Product();
        product.setName(name);
        product.setContainArticles(productContainArticles);
        return product;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("contain_articles")
    public List<ProductContainArticles> getContainArticles() {
        return productContainArticles;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("contain_articles")
    public void setContainArticles(List<ProductContainArticles> productContainArticles) {
        this.productContainArticles = productContainArticles;
    }

    @Override
    public String toString() {
        return "\"Product name\": " + name + ", " +
                "\"Contains articles\": " + productContainArticles;
    }
}