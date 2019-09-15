package com.ranokuhl.warehouse.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
public class Article {

    @Field("art_id")
    private String articleId;
    @Field("name")
    private String articleName;
    private String stock;

    private String amount_of;

    public Article() {
    }

    public Article(String articleId, String articleName, String stock, String amount_of) {
        this.articleId = articleId;
        this.articleName = articleName;
        this.stock = stock;
        this.amount_of = amount_of;
    }
}
