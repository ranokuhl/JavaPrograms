package com.ingka.warehouse.article;

public class ContainArticles {

    private String artId;
    private String amountOf;

    public ContainArticles() {
    }

    public ContainArticles(String artId, String amountOf) {
        super();
        this.artId = artId;
        this.amountOf = amountOf;
    }

    public String getArtId() {
        return artId;
    }

    public String getAmountOf() {
        return amountOf;
    }

    public void setArtId(String artId) {
        this.artId = artId;
    }

    public void setAmountOf(String amountOf) {
        this.amountOf = amountOf;
    }
}
