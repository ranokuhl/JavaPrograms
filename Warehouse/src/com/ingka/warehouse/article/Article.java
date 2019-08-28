package com.ingka.warehouse.article;

public class Article {

    private String art_id;
    private String amount_of;

    public Article() {

    }

    public String getArt_id() {
        return art_id;
    }

    public String getAmount_of() {
        return amount_of;
    }

    public void setArt_id(String art_id) {
        this.art_id = art_id;
    }

    public void setAmount_of(String amount_of) {
        this.amount_of = amount_of;
    }

//    @Override
//    public String toString() {
//        return getArt_id() + getAmount_of();
//    }
}
