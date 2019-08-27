package com.ingka.warehouse.article;

import java.util.List;

public class Article {

    private int art_id;
    private String name;
    private int stock;

    public Article(int art_id, String name, int stock) {
        this.art_id = art_id;
        this.name = name;
        this.stock = stock;
    }

    public int getArt_id() {
        return art_id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setArt_id(int art_id) {
        this.art_id = art_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getArt_id() + ", " +
                getName() + ", " +
                getStock();
    }
}


