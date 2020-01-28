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
    @JsonProperty("name")
    private String name;
    @JsonProperty("contain_articles")
    private Parts[] parts;
//    private List<Parts> parts;
    //private Parts[] parts;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + name + '\'' +
                ", parts=" + parts +
                '}';
    }
}

