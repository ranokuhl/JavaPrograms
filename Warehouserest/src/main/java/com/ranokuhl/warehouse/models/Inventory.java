package com.ranokuhl.warehouse.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
public class Inventory {

    private List<Articles> inventory;


    public Inventory() {
    }

    public Inventory(List<Articles> inventory) {
        this.inventory = inventory;
    }
}
