package com.ingka.warehouse.product;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ingka.warehouse.article.ArticleInventoryRepository;
import flexjson.JSON;

import java.util.List;

public class ProductContainArticles {

    private String artId;
    private String amountOf;

    public ProductContainArticles() {
    }

    public ProductContainArticles of(String artId, String amountOf) {
        ProductContainArticles productContainArticles = new ProductContainArticles();
        productContainArticles.setArtId(artId);
        productContainArticles.setAmountOf(amountOf);
        return productContainArticles;
    }

    @JsonProperty("art_id")
    public String getArtId() {
        return artId;
    }

    @JsonProperty("amount_of")
    public String getAmountOf() {
        return amountOf;
    }

    @JsonProperty("art_id")
    public void setArtId(String artId) {
        this.artId = artId;
    }

    @JsonProperty("amount_of")
    public void setAmountOf(String amountOf) {
        this.amountOf = amountOf;
    }

    @Override
    public String toString() {
        return "Article number: " + artId + ", " +
                "Amount: " + amountOf;
/*        return "{\"art_id\": " + artId + ", " +
                "\"amount_of\": " + amountOf + "}";*/
    }
}
