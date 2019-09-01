package com.ingka.warehouse.article;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Testing {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();



        JsonNode root = mapper.readTree(new File("c:\\app-win\\json\\products.json"));

        JsonNode rootNode = root;
        JsonNode productsNode = root.path("products");

        for(JsonNode products : productsNode) {

            System.out.println("Products : " + products);

            System.out.println(products.get(1));

            JsonNode containArticles = rootNode.findValue("contain_articles");

            for(JsonNode article : containArticles) {
                System.out.println("Article : " + article);
            }
        }
    }
}
