package com.ingka.warehouse.engine;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RemoveProduct {

    private static Scanner scanner = new Scanner(System.in);

    private static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {

/*

        // read json from file to JsonNode
*/
/*

        StringBuilder jsonContent = new StringBuilder();
        Path inputPath = Paths.get("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/array.json");
        System.out.println(jsonContent);*//*



        JsonNode root = mapper.readTree(new File("c:\\app-win\\json\\products.json"));
        JsonNode productsNode = root.get("products");
//        JsonNode containArticles = root.get("contain_articles");
        System.out.println("Root is object?" + root.isObject());

        System.out.println("Products is array?: " + productsNode.isArray());





        System.out.println("-------- Products List ----------");
        if(productsNode.isArray()) {

            for(JsonNode products : productsNode) {
                System.out.println(products.asText());
            }
            System.out.println("=============================");

            System.out.println("Enter name of product that has been sold: \n");
            System.out.print(">");
        }

*/
/*        String name = scanner.nextLine();



        System.out.println(name + " has been removed from Products. Inventory stock has been adjusted.");*//*







        JsonNode containProducts = root.findValue("products").get(0);



        System.out.println(containProducts);






        System.out.println("=============================");




        JsonNode containArticles = root.findValue("contain_articles").get(0);
        JsonNode containArticles2 = root.findValue("contain_articles").get(1);
        System.out.println("Contain articles : " + containArticles);
        System.out.println("Contain articles : " + containArticles2);



*/





//        root1.add()
//
//        if (products.isArray()) {
//            for (final JsonNode item : products) {
//
//            }
//        }

//        ObjectNode productsNode = mapper.createObjectNode(),objectNode;
//        productsNode.put("name", "Fall Out 4");
//        ((ObjectNode) root).put("blaat", "blaatvalue");

//        JsonNode productsNode = root.path("products");
//
//        System.out.println(productsNode);

//        if (productsNode.isArray()) {
//
//            System.out.println("Is this node an Array? " + productsNode.isArray());
//
//            for (JsonNode node : productsNode) {
//                String name = node.path("name").asText();
//                System.out.println("name : " + name);
//            }
//        }
/*
        JsonNode productsNode = root.path("products");
        if (productsNode.isArray()) {

            System.out.println("Is this node an Array? " + productsNode.isArray());

            for (JsonNode node : productsNode) {
                String name = node.path("name").asText();
                System.out.println("name : " + name);
            }
        }
*/



//        // Write to JSON
//        String resultUpdate = mapper.writeValueAsString(root);
//        System.out.println("Print results: " + resultUpdate);


//
//        (JsonNode productsNode) = (ObjectNode) root.path("products");
//
//        for (JsonNode node : productsNode) {
//            System.out.println(node.get("name").asText());
//        }

//        System.out.println("Enter name to remove product: \n");
//        String name = scanner.nextLine();


    }
}





        // update json







//        for (int i = 0; i < productNode.at("/products").toString().length(); i++) {
//            System.out.println(productNode.at("/products").findValues("name").get(i).asText());
//        }
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

//        }
//    }




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



