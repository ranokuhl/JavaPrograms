package com.ranokuhl.warehouse.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private String art_id;
    private String amount_of;

    public Product() {
    }

    public Product(String art_id, String amount_of) {
        this.art_id = art_id;
        this.amount_of = amount_of;
    }
}
