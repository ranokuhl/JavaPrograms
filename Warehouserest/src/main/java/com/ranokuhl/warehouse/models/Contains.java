package com.ranokuhl.warehouse.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contains {

    private String art_id;
    private String amount_of;

    public Contains() {
    }

    public Contains(String art_id, String amount_of) {
        this.art_id = art_id;
        this.amount_of = amount_of;
    }
}
