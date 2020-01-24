package com.ranokuhl.warehouse.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Arrays;
import java.util.List;

@Data
@Entity(noClassnameStored = true)
@AllArgsConstructor
@Getter
@Setter
@Document(value = "Product")
public class Product {

    @Id
    private ObjectId id;
//    @JsonProperty("name")
    private String name;
//    @JsonProperty("contain_articles")
    private List<Parts> contain_articles;
//    private Parts[] parts;

    public Product() {
    }

}

