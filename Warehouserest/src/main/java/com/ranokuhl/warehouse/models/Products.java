package com.ranokuhl.warehouse.models;

import com.querydsl.core.annotations.QueryEntity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@QueryEntity
@Data
@Document(collection = "products")
public class Products {

    @Id
    private String id;
    private List<Product> products;
}
