package com.ingka.warehouse.article;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class TreeModel {


    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {

        // listInventory();
        listProducts();

    }

    private static void listProducts() {

        try {

            JsonNode rootArrayProducts = mapper.readTree(new File("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/products.json"));

            for (JsonNode rootProducts : rootArrayProducts) {

                System.out.println("Root path: " + rootProducts);

                for (JsonNode productsArray : rootProducts) {
                    // System.out.println("Products Array: " + productsArray);
                    System.out.println("========================");
                    System.out.println("Product name: " + productsArray.path("name").asText());

                    for (JsonNode containArticlesArray : productsArray) {
                        // System.out.println("ContainArticles: " + containArticlesArray);
                        for (JsonNode innerContainArticlesArray : containArticlesArray) {

                            // System.out.println("InnerContainerArticlesArray: " + innerContainArticlesArray);
                            System.out.println("Article number: " + innerContainArticlesArray.path("art_id"));
                            System.out.println("Amount of: " + innerContainArticlesArray.path("amount_of"));
                        }
                    }
                    System.out.println("========================");
                }
            }
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void listInventory() {

        try {

            //JsonNode root = mapper.readTree(new File("c:\\app-win\\json\\user.json"));
            JsonNode rootArrayInventory = mapper.readTree(new File("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/inventory.json"));

            for (JsonNode rootInventory : rootArrayInventory) {
                System.out.println("RootArayInventory: " + rootInventory);

                for (JsonNode inventoryArray : rootInventory) {
                    // System.out.println("inventoryArray: " + inventoryArray);
                    System.out.println("========================");
                    System.out.println("Article number: " + inventoryArray.path("art_id").asText());
                    System.out.println("Article name: " + inventoryArray.path("name").asText());
                    System.out.println("Stock: " + inventoryArray.path("stock").asText());
                }

            }
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
