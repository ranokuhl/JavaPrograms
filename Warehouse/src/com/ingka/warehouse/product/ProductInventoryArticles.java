package com.ingka.warehouse.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductInventoryArticles {

    private String artId;
    private String name;
    private String stock;

    public ProductInventoryArticles() {
    }

    public ProductInventoryArticles(String artId, String name, String stock) {
        this.artId = artId;
        this.name = name;
        this.stock = stock;
    }
    @JsonProperty("art_id")
    public String getArtId() {
        return artId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("stock")
    public String getStock() {
        return stock;
    }

    @JsonProperty("art_id")
    public void setArtId(String artId) {
        this.artId = artId;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("stock")
    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "{\"art_id\": " + artId + ", " +
                "\"name\": " + name + ", " +
                "\"stock\": " + "\"" + stock + "\"" + "}";
    }
}
