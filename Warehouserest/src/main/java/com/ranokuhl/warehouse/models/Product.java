package com.ranokuhl.warehouse.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@Setter
@Getter
@Entity(noClassnameStored = true)
@Document(collection = "Product")
public class Product {

    @Id
    private String id;
    private String name;
    @JsonProperty("contain_articles")
    private List<Parts> parts;
    //private Parts[] parts;
    //private Parts[] parts;

    public Product() {}
}



