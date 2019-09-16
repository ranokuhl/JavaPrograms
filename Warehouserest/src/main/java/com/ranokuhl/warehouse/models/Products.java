package com.ranokuhl.warehouse.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "products")
@AllArgsConstructor
@Getter
@Setter
public class Products {

    @Id
    private String id;
    private List<Product> products;
}
