package com.ranokuhl.warehouse.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.ranokuhl.warehouse.models.Inventory;
import com.ranokuhl.warehouse.models.Products;
import org.bson.Document;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataSetReaderProducts implements CommandLineRunner {

    private MongoTemplate mongoTemplate;

    // Constructor
    public DataSetReaderProducts(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) {
        // Dropping the products collection in mongodb
        this.mongoTemplate.dropCollection(Products.class);

        // Dropping the inventory collection in mongodb
        this.mongoTemplate.dropCollection(Inventory.class);

        // Add data from json file in mongodb
        try {

            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(
                    DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

            InputStream inputStreamProducts = classLoader.getResourceAsStream("json/products.json");
            InputStream inputStreamInventory = classLoader.getResourceAsStream("json/inventory.json");

/*            // Load Inventory json at startup
            InputStreamReader inputStreamReaderInventory = new InputStreamReader(inputStreamInventory);
            BufferedReader bufferedReaderInventory = new BufferedReader(inputStreamReaderInventory);
            StringBuffer stringBufferInventory = new StringBuffer();

            String line1 = "";
            while ((line1 = bufferedReaderInventory.readLine()) != null) {
                stringBufferInventory.append(line1);
            }

            MongoClient client1 = new MongoClient("localhost");
            MongoCollection<Document> collectionInventory = client1.getDatabase("warehouse").getCollection("inventory");
            Document doc1 = Document.parse(stringBufferInventory.toString());
            collectionInventory.insertOne(doc1);

            System.out.println("Inventory loaded!");*/

            // Load Products Json at startup
            InputStreamReader inputStreamReader = new InputStreamReader(inputStreamProducts);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuffer stringBufferProducts = new StringBuffer();

            String line2 = "";
            while ((line2 = bufferedReader.readLine()) != null) {
                stringBufferProducts.append(line2);
            }


//            MongoClient client2 = new MongoClient("localhost");
//            MongoTemplate mongoTemplate = new MongoTemplate(client2, "warehouse");
//            System.out.println("StringBufferProducts:" + stringBufferProducts);

//            mongoTemplate.insert(stringBufferProducts);
            MongoClient client2 = new MongoClient("localhost");
            MongoCollection<Document> collectionProducts = client2.getDatabase("warehouse").getCollection("products");
//            Document doc2 = Document.parse(stringBufferProducts.toString());

            // Create List to add the documents in the array
            List<Document> docs2 = new ArrayList<>();




            collectionProducts.insertMany(docs2);

            System.out.println("Products loaded!");
        } catch (IOException e) {
            System.out.println("Not able to load products: " + e.getMessage());
        }
    }
}
