package com.ingka.warehouse.article;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ArticleInventory {

    private String artId;
    private String articleName;
    private String stock;

    public ArticleInventory() {
    }

    public ArticleInventory of(String artId, String articleName, String stock) {
        ArticleInventory articleInventory = new ArticleInventory();
        articleInventory.setArtId(artId);
        articleInventory.setArticleName(articleName);
        articleInventory.setStock(stock);
        return articleInventory;
    }

    @JsonProperty("art_id")
    public String getArtId() {
        return artId;
    }

    @JsonProperty("name")
    public String getArticleName() {
        return articleName;
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
    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    @JsonProperty("stock")
    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "\"Article number\": " + artId + ", " +
                "\"Article name\": " + articleName + ", " +
                "\"Stock\" " + stock;
    }

}