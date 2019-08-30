package com.ingka.warehouse.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductContainArticles {

    private String artId;
    private String amountOf;

    public ProductContainArticles() {
    }

    public static ProductContainArticles of(String artId, String amountOf) {
        ProductContainArticles containArticles = new ProductContainArticles();
        containArticles.setArtId(artId);
        containArticles.setAmountOf(amountOf);
        return containArticles;
//        this.artId = artId;
//        this.amountOf = amountOf;
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
        return "{\"art_id\": " + artId + ", " +
                "\"amount_of\": " + amountOf + "}";
    }
}
