package com.ingka.warehouse.article;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ProductRepository {

    public static void main(String[] args) throws IOException {


        File jsonFile = new File("c:\\app-win\\json\\products.json");

        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNodeRoot = objectMapper.readTree(jsonFile);



//        JsonNode contactNode = jsonNodeRoot.path("products");
//        if (contactNode.isArray()) {
//
////            System.out.println("Is this node an Array? " + contactNode.isArray());
//
//            System.out.println("++++ Current Products ++++\n");
//            for (JsonNode node : contactNode) {
//                String name = node.path("name").asText();
//                String contain_articles = node.path("contain_articles").asText();
//                System.out.println(name);
//                System.out.println(contain_articles);
//            }
//        }

        JsonNode node2 = new ObjectMapper().readTree(jsonFile);




        if (node2.isArray()) {

            for (JsonNode innerNode : node2) {
                String art_id = innerNode.path("art_id").asText();
                String amount_of = innerNode.path("amount_of").asText();
                System.out.println("article id: " + art_id);
                System.out.println("amount_of: " + amount_of);
            }
        }



//        JsonNode contain_articlesNode = jsonNodeRoot.path("contain_articles");
//        Iterator<JsonNode> iterator = contain_articlesNode.elements();
//
//        while (iterator.hasNext()) {
//            JsonNode contain_articles = iterator.next();
//            System.out.println(contactNode.asText());
//        }



//        if (contain_articlesNode.isArray()) {
//
//            for (JsonNode innerNode : contain_articlesNode) {
//                String art_id = innerNode.path("art_id").asText();
//                String amount_of = innerNode.path("amount_of").asText();
//                System.out.println("article id: " + art_id);
//                System.out.println("amount_of: " + amount_of);
//            }
//        }
    }


}
