package com.ranokuhl.mongostore.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class ProductReview {

    private String username;
    private int rating;
}
