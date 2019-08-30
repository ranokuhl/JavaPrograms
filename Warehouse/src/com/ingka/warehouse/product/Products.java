package com.ingka.warehouse.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonMerge;

import java.util.List;

// @JsonIgnoreProperties(ignoreUnknown = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Products {

    @JsonMerge
    private List<Product> products;

    public Products() {
    }

    public static Products of(List<Product> products) {
        Products products1 = new Products();
        products1.setProducts(products);
        return products1;
        // this.products = products;
    }

//    public Products(List<Product> products) {
//        this.products = products;
//    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "products: " + products;
    }
}
