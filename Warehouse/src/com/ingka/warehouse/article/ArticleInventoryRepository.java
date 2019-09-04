package com.ingka.warehouse.article;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


public class ArticleInventoryRepository {

    public static void main(String[] args) throws IOException {

//         File jsonFile = new File("c:\\app-win\\json\\inventory.json");
        File jsonFile = new File("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/inventory.json");

        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNodeRoot = objectMapper.readTree(jsonFile);

        JsonNode articlesNode = jsonNodeRoot.path("inventory");
        if (articlesNode.isArray()) {

            System.out.println("++++ Current inventory ++++\n");
            for (JsonNode node : articlesNode) {
                String art_id = node.path("art_id").asText();
                String name = node.path("name").asText();
                String stock = node.path("stock").asText();

                System.out.println("Article name: " + name);
                System.out.println("In stock: " + stock);
                System.out.println("Article number: " + art_id);
                System.out.printf("\n");
            }
        }
    }
}
