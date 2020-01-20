package com.ranokuhl.warehouse.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Arrays;
import java.util.List;

//@AllArgsConstructor
//@Getter
//@Setter
//public class Product {
//
//    @Indexed
//    private String name;
//    // Refers to Parts class
//    @Field("contain_articles")
//    private List<Parts> contain_articles;
//}

public class Product {

    @JsonProperty("name")
    private String productName;
    @JsonProperty("contain_articles")
    private Parts[] parts;

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


