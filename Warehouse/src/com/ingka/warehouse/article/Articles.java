package com.ingka.warehouse.article;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

//@JsonIgnoreProperties(ignoreUnknown = true)
// is Product.java
public class Articles {

    private List<ArticleInventory> articleInventory;

    public Articles() {
    }

    public static Articles of(List<ArticleInventory> articleInventory) {
        Articles articles = new Articles();
        articles.setArticleInventory(articleInventory);
        return articles;
    }

    @JsonProperty("inventory")
    public List<ArticleInventory> getArticleInventory() {
        return articleInventory;
    }

    @JsonProperty("inventory")
    public void setArticleInventory(List<ArticleInventory> articleInventory) {
        this.articleInventory = articleInventory;
    }

    @Override
    public String toString() {
        return "\"Inventory list\":" + articleInventory;
    }


}
