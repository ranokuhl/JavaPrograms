package com.ranokuhl.warehouse.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "products")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Products {

    @Id
    private String id;
    @Field("products")
    private List<Product> products;
}
