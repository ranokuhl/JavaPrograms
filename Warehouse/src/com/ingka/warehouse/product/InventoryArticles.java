package com.ingka.warehouse.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InventoryArticles {


    private String artId;
    private String name;
    private String stock;

    public InventoryArticles() {
    }

    public InventoryArticles(String artId, String name, String stock) {
        this.artId = artId;
        this.name = name;
        this.stock = stock;
    }

    /*    public static ProductInventory of(String artId, String name, String stock) {
        ProductInventory productInventory = new ProductInventory();
        productInventory.setArtId(artId);
        productInventory.setName(name);
        productInventory.setStock(stock);
        return productInventory;
    }*/

    @JsonProperty("art_id")
    public String getArtId() {
        return artId;
    }

    public String getName() {
        return name;
    }

    public String getStock() {
        return stock;
    }

    @JsonProperty("art_id")
    public void setArtId(String artId) {
        this.artId = artId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "[{art_id: " + artId + ", " +
                "name: " + name + ", " +
                "stock: " + stock + "}]";
    }
}


