package com.ranokuhl.warehouse.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Product {

    @Indexed
    private String name;
    // Refers to Parts class
    @Field("contain_articles")
    private List<Parts> contain_articles;
}
