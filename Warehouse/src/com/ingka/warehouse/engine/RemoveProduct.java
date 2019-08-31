package com.ingka.warehouse.engine;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.io.File;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class RemoveProduct {

    public static void main(String[] args) throws IOException {


        // read json from file to JsonNode
/*

        StringBuilder jsonContent = new StringBuilder();
        Path inputPath = Paths.get("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/array.json");
        System.out.println(jsonContent);

*/
        ObjectMapper mapper = new ObjectMapper();
        JsonNode productNode = mapper.readTree(new File("c:\\app-win\\json\\products.json"));
        // System.out.println(productNode.findParents("contain_articles").get(1).findParent("amount_of").get("amount_of")); // gives 4

        //int productAmount = productNode.findParents("contain_articles").get(1).findParent("amount_of").get("amount_of").asInt();


        for (int i = 0; i < productNode.at("/products").toString().length(); i++) {
            System.out.println(productNode.at("/products").findValues("name").get(i).asText());
        }
//        System.out.println(productNode.at("/products").findValues("name").get(0).asText());
//        System.out.println(productNode);

/*
        // Calculate stock test - working
        int productAmount = productNode.findValue("amount_of").asInt();
        System.out.println("Product amount: " + productAmount);

        JsonNode inventoryNode = mapper.readTree(new File ("c:\\app-win\\json\\inventory.json"));
        System.out.println("In stock : " + inventoryNode.findValues("stock"));

        int calculate = inventoryNode.findValue("stock").asInt() - productAmount;
        System.out.println("Total in stock left : " + calculate);

*/

//        System.out.println(productNode.findParents("contain_articles").get(0));


//        JsonNode carNode = rootNode.path("products");
//        System.out.println(carNode.asText());
//
//        JsonNode priceNode = rootNode.path("price");
//        System.out.println(priceNode.asText());
//
//        JsonNode modelNode = rootNode.path("model");
//        System.out.println(modelNode.asText());




//        System.out.println("products : " + printProducts.asText());

        }
    }




/*




        JsonNode containArticlesNode = rootNode.path("contain_articles");
        Iterator<JsonNode> iterator = containArticlesNode.elements();
        System.out.println("=== Begin Printing");

        while (iterator.hasNext()) {
            JsonNode contain_articles = iterator.next();
            System.out.println(contain_articles.asText());
        }
        System.out.println("=== End Printing");

//        Files.lines(inputPath).forEach(jsonContent::append);
//        JsonNode rootNode = new ObjectMapper(new JsonFactory())
//                .readTree(jsonContent.toString());

*/




/*


        System.out.println("Before:");
        System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter()
                .writeValueAsString(rootNode));


        /// DO Something


        System.out.println("\n\nAfter:");
        System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter()
                .writeValueAsString(rootNode));
*/

/*
        // save our modified employee to file
        Path outputPath = Paths.get("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/array.json");
        try (BufferedWriter wr = Files.newBufferedWriter(outputPath)) {
            wr.write(rootNode.toString());
*/



