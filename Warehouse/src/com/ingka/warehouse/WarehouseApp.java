package com.ingka.warehouse;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ingka.warehouse.article.Articles;
import com.ingka.warehouse.product.Products;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WarehouseApp {

    private static final ObjectMapper mapper = new ObjectMapper();
    private static final File PRODUCTS_JSON = new File("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/products.json");
    private static final File INVENTORY_JSON = new File("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/inventory.json");
    private static Scanner scanner = new Scanner(System.in);

//    private static ProductController controller;

    public static void main(String[] args) throws IOException {

        boolean quit = false;
        startApp();
        printActions();
        while(!quit) {

            System.out.println("\nEnter action: (5 available actions) If you want to print the menulist press 4");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    listInventory();
                    break;
                case 2:
                    listProducts();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    printActions();
                    break;
            }
        }

    }


    private static void startApp() {
        System.out.println("Starting app..");
    }


    private static void printActions() {
        System.out.println("Available actions: \npress");
        System.out.println("0 - Quit\n" +
                "1 - List inventory\n" +
                "2 - List products\n" +
                "3 - Remove a product\n" +
                "4 - Print menu list\n");
        System.out.println("Choose your action: ");
    }

    private static void listProducts() throws IOException{

        Products products = mapper.readValue(PRODUCTS_JSON, Products.class);

        System.out.println("----- List of products ------");
        for (int i = 0; i < products.getProducts().size(); i++) {
            System.out.println(i + 1 +
                    " : " + products.getProducts().get(i).getName());
        }
    }

    private static void listInventory() throws IOException{

        Articles articles = mapper.readValue(INVENTORY_JSON, Articles.class);

            System.out.println(articles.toString());
    }

    private static void removeProduct() throws IOException {

//            Products products = mapper.readValue(PRODUCTS_JSON, Products.class);

        // print list of products
        System.out.println("===== Remove a Product ====");
        listProducts();



        // ask which product to delete
        System.out.println("Enter product number to remove: ");
        int input = scanner.nextInt() -1;

        // delete number / position
        // Instantiate JSON object to get deletion
        // Product ID of selection -1

        ObjectNode root = (ObjectNode) mapper.readTree(PRODUCTS_JSON);
        ArrayNode array = (ArrayNode) root.get("products");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(array));
//            System.out.println(array.get(1).get("name").asInt());
        System.out.println(array.get(input));
        array.remove(input);

        System.out.println("-- after ---");
        System.out.println(array);

        String resultUpdate = mapper.writerWithDefaultPrettyPrinter().writeValueAsString("{\"Products\":" +  array + "}");
//        String resultUpdate = mapper.writeValueAsString(array);

//        System.out.println("After update: " + resultUpdate);

        JsonFactory factory = new JsonFactory();

        JsonGenerator generator = factory.createGenerator(
                new File("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/productsUpdated.json"), JsonEncoding.UTF8);


        generator.writeObject(resultUpdate);

        generator.close();
    }
}

