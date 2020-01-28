package com.ranokuhl.warehouse.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.ranokuhl.warehouse.models.Product;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import java.io.*;


@Component
public class DataSetReaderProducts implements CommandLineRunner {

    @Override
    public void run(String... args) {

        // Add data from json file in mongodb
        try {

            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

            ObjectMapper mapper = new ObjectMapper();

            InputStream inputStreamProducts = classLoader.getResourceAsStream("json/product.json");

            Product[] product = mapper.readValue(inputStreamProducts, Product[].class);

            MongoClient client1 = new MongoClient("localhost");

            // Dropping the Product collection in mongodb
            client1.dropDatabase("warehouse");

//          ## Start Morphia part
            Morphia morphia = new Morphia();
            morphia.map(Product.class);

            Datastore datastore = morphia.createDatastore(client1, "warehouse");

            for (Product valueProducts : product) {
                datastore.save(valueProducts);
            }
//          ## End Morphia Part

//          # Start populating mongodb from Inventory json

            mapper.configure(
                    DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

            InputStream inputStreamInventory = classLoader.getResourceAsStream("json/inventory.json");

            // Load Inventory json at startup
            assert inputStreamInventory != null;
            InputStreamReader inputStreamReaderInventory = new InputStreamReader(inputStreamInventory);
            BufferedReader bufferedReaderInventory = new BufferedReader(inputStreamReaderInventory);
            StringBuilder stringBufferInventory = new StringBuilder();

            String line1 = "";
            while ((line1 = bufferedReaderInventory.readLine()) != null) {
                stringBufferInventory.append(line1);
            }

            MongoCollection<Document> collectionInventory = client1.getDatabase("warehouse").getCollection("inventory");
            Document doc1 = Document.parse(stringBufferInventory.toString());
            collectionInventory.insertOne(doc1);

            System.out.println("Inventory loaded!");
            System.out.println("Products loaded!");
        } catch (Exception e) {
            System.out.println("Not able to load products: " + e.getMessage());
        }
    }
}
