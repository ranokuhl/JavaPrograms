package com.ranokuhl.mongostore.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@Document(collection = "legosets")
public class LegoSet {

    @Id
    private String id;
    private String name;
    private LegoSetDifficulty difficulty;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String theme;
    private Collection<ProductReview> reviews = new ArrayList();
    @Field("delivery")
    private DeliveryInfo deliveryInfo;

    public <legoSet> LegoSet(String millennium_falcon, String star_wars, LegoSetDifficulty hard, DeliveryInfo deliveryInfo, List<legoSet> asList) {
    }
}
