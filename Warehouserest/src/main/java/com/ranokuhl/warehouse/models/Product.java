package com.ranokuhl.warehouse.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Arrays;
import java.util.List;

@Data
@Entity
public class Product {

    @Id
    private ObjectId id;
    @JsonProperty("name")
    private String productName;
    @JsonProperty("contain_articles")
    private Parts[] parts;

    public ObjectId getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Parts[] getParts() {
        return parts;
    }

    public void setParts(Parts[] parts) {
        this.parts = parts;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", parts=" + Arrays.toString(parts) +
                '}';
    }
}

