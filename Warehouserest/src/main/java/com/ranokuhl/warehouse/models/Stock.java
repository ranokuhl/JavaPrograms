package com.ranokuhl.warehouse.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("stock")
    private String amount;

    public Stock() {
    }
}
