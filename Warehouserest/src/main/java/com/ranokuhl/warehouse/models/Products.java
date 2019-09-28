package com.ranokuhl.warehouse.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "products")
public class Products {

    @Id
    private String id;
    @Field("products")
    private List<Product> products;
}
