package com.ranokuhl.warehouse.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@Getter
@Setter
public class Article {

    @Field("art_id")
    private String articleId;
    @Field("name")
    private String articleName;
    private String stock;
}
