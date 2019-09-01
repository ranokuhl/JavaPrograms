package com.ingka.warehouse.article;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

public class Article {

    private String artId;
    private String amount_of;

    public Article() {

    }

    public Article(String artId, String amount_of) {
        this.artId = artId;
        this.amount_of = amount_of;
    }

    @JsonProperty("art_id")
    public String getArtId() {
        return artId;
    }

    public String getAmount_of() {
        return amount_of;
    }

    @JsonProperty("art_id")
    public void setArtId(String artId) {
        this.artId = artId;
    }

    public void setAmount_of(String amount_of) {
        this.amount_of = amount_of;
    }

    public String toString() {
        return "artId: \"" + artId + "\"" +
                "amount_of: \"" + amount_of + "\"";
    }
}
