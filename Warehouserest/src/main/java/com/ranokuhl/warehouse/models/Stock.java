package com.ranokuhl.warehouse.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stock {

    private String art_id;
    private String name;
    private String stock;

    public Stock() {
    }
}
