package com.ingka.warehouse.product;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductInventory {

    @JsonMerge
    private Set<ProductInventoryArticles> inventory;

    public ProductInventory() {
    }

    public ProductInventory(Set<ProductInventoryArticles> inventory) {
        this.inventory = inventory;
    }

    public Set<ProductInventoryArticles> getInventory() {
        return inventory;
    }

    public void setInventory(Set<ProductInventoryArticles> inventory) {
        this.inventory = inventory;
    }



    @Override
    public String toString() {
        return "inventory: " + inventory;
    }
}
