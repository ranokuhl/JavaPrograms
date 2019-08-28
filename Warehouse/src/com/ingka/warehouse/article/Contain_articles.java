package com.ingka.warehouse.article;

public class Contain_articles {

    private Long art_id;
    private int amount_of;

    public Contain_articles() {

    }

    public Contain_articles(Long art_id, int amount_of) {
        this.art_id = art_id;
        this.amount_of = amount_of;
    }

    public Long getArt_id() {
        return art_id;
    }

    public int getAmount_of() {
        return amount_of;
    }

    public void setArt_id(Long art_id) {
        this.art_id = art_id;
    }

    public void setAmount_of(int amount_of) {
        this.amount_of = amount_of;
    }
}
