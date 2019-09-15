package com.ranokuhl.warehouse.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document
@Getter
@Setter
public class Inventory {

    // Refers to Article class
    @Field("inventory")
    private List<Article> articles;


    public Inventory() {
    }

    public Inventory(List<Article> articles) {
        this.articles = articles;
    }
}
