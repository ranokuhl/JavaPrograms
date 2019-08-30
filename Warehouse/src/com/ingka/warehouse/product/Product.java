package com.ingka.warehouse.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

    private String name;
    @JsonMerge
    private List<ProductContainArticles> containArticles;

    public Product() {

    }

    public Product(String name, List<ProductContainArticles> containArticles) {
        this.name = name;
        this.containArticles = containArticles;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("contain_articles")
    public List<ProductContainArticles> getContainArticles() {
        return containArticles;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("contain_articles")
    public void setContainArticles(List<ProductContainArticles> containArticles) {
        this.containArticles = containArticles;
    }

    /*
    private List <ContainArticles> containArticles;
    private String name;


    public Product() {

    }

    public static Product of(List containArticles, String name) {
        Product product = new Product();
        product.name = name;
        product.containArticles = containArticles;
        return product;
    }

    @JsonProperty("contain_articles")
    public List getContainArticles() {
        return containArticles;
    }

    public void setContainArticles(List containArticles) {
        this.containArticles = containArticles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\"name\": " + name +
                "\"contain_articles\": " + containArticles;
    }*/
}
