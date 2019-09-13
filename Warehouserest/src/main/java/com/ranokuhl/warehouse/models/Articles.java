package com.ranokuhl.warehouse.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Articles {

    private String art_id;
    private String name;
    private String stock;

    public Articles() {
    }

    public Articles(String art_id, String name, String stock) {
        this.art_id = art_id;
        this.name = name;
        this.stock = stock;
    }
}
