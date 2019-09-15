package com.ranokuhl.warehouse.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Products {

    private String name;
    private List<Article> contain_articles;

    public Products() {
    }

    public Products(String name, List<Article> contain_articles) {
        this.name = name;
        this.contain_articles = contain_articles;
    }
}
