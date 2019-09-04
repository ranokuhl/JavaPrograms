package com.ingka.warehouse.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

// @JsonIgnoreProperties(ignoreUnknown = true)
public class Products {

    private List<Product> products;

    public Products() {
    }

    public static Products of(List<Product> products) {
        Products products1 = new Products();
        products1.setProducts(products);
        return products1;
    }

    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "products: " + products;
    }

}
