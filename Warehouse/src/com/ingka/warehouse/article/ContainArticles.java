package com.ingka.warehouse.article;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContainArticles {

    private String artId;
    private String amountOf;

    public ContainArticles() {
    }

    public static ContainArticles of(String artId, String amountOf) {
        ContainArticles containArticles = new ContainArticles();
        containArticles.artId = artId;
        containArticles.amountOf = amountOf;
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
        return "\"art_id\": " + artId +
                "\"amount_of\": " + amountOf;
    }
}
