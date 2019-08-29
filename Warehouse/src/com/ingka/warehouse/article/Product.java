package com.ingka.warehouse.article;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

    private String name;
    @JsonProperty("contain_articles")
    private List <ContainArticles> containArticles;

    public Product() {
    }

    public Product(String name, List containArticles) {
        super();
        this.name = name;
        this.containArticles = containArticles;
    }

    public List getContainArticles() {
        return containArticles;
    }

    public void setContainArticles(List containArticles) {
        this.containArticles = containArticles;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + name;
    }

    /*
    @JsonProperty("contain_articles")
    private List containArticles;

    public Product() {
    }

    public Product(String name, List containArticles) {
        super();
        this.name = name;
        this.containArticles = containArticles;
    }

    public String getName() {
        return name;
    }

    @JsonProperty("contain_articles")
    public List getContainArticles() {
        return containArticles;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("contain_articles")
    public void setContainArticles(List containArticles) {
        this.containArticles = containArticles;
    }
    */
}
