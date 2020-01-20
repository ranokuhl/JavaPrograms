package com.ranokuhl.warehouse.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//public class Parts {
//
//    @Indexed
//    private String art_id;
//    private String amount_of;
//}

@JsonIgnoreProperties(ignoreUnknown = true)
public class Parts {

    @JsonProperty("art_id")
    private String articleId;
    @JsonProperty("amount_of")
    private String amount;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Parts{" +
                "articleId='" + articleId + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
