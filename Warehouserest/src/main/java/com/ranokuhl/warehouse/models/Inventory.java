package com.ranokuhl.warehouse.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Setter
@Getter
@Document(value = "Inventory")
public class Inventory {

    @JsonProperty("art_id")
    private String articleId;
    @JsonProperty("name")
    private String articleName;
    private String stock;

    public Inventory() {}

    @Override
    public String toString() {
        return "Inventory{" +
                "articleId='" + articleId + '\'' +
                ", articleName='" + articleName + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }
}
