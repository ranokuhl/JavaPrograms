package com.ingka.warehouse.article;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


public class InventoryRepository {

    public static void main(String[] args) throws IOException {

        File jsonFile = new File("c:\\app-win\\json\\inventory.json");

        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNodeRoot = objectMapper.readTree(jsonFile);

        JsonNode contactNode = jsonNodeRoot.path("inventory");
        if (contactNode.isArray()) {

//            System.out.println("Is this node an Array? " + contactNode.isArray());

            System.out.println("++++ Current inventory ++++\n");
            for (JsonNode node : contactNode) {
                String art_id = node.path("art_id").asText();
                String name = node.path("name").asText();
                String stock = node.path("stock").asText();

                System.out.println("Article name: " + name);
                System.out.println("In stock: " + stock);
                System.out.println("Article number: " + art_id);
                System.out.printf("\n");

//                System.out.println("art_id : " + art_id);
//                System.out.println("name : " + name);
//                System.out.println("stock : " + stock);
            }
        }






    }

}
