package com.ranokuhl.warehouse.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "inventory")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Inventory {

    // Refers to Article class
    @Field("inventory")
    private List<Article> articles;
}
