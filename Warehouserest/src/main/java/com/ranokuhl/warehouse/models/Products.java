package com.ranokuhl.warehouse.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@Document(collection = "products")
public class Products {

    @Id
    private String id;
    private String name;
    @Field("contain_articles")
    private List<Parts> contain_articles;

}
