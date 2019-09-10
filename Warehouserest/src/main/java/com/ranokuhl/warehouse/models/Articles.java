package com.ranokuhl.warehouse.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Articles {

    @Id
    private long artId;
    private String name;
    private long stock;

    public Articles() {
    }

    public Articles(long artId, String name, long stock) {
        this.artId = artId;
        this.name = name;
        this.stock = stock;
    }

    public long getArtId() {
        return artId;
    }

    public String getName() {
        return name;
    }

    public long getStock() {
        return stock;
    }

    public void setArtId(long artId) {
        this.artId = artId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }
}
