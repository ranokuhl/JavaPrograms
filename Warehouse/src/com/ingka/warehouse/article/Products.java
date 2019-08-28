package com.ingka.warehouse.article;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Products {


    private List products;
    private String name;
    private Set < Contain_articles > contain_articles = new HashSet< >();
    private Article article;

    public Products() {

    }

    public Products(List products, String name, Set<Contain_articles> contain_articles, Article article) {
        this.products = products;
        this.name = name;
        this.contain_articles = contain_articles;
        this.article = article;
    }

    public List getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public Set<Contain_articles> getContain_articles() {
        return contain_articles;
    }

    public Article getArticle() {
        return article;
    }

    public void setProducts(List products) {
        this.products = products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContain_articles(Set<Contain_articles> contain_articles) {
        this.contain_articles = contain_articles;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
