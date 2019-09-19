package com.ranokuhl.warehouse.services;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.ranokuhl.warehouse.models.Products;
import org.bson.Document;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

@Service
public class DataSetReaderProducts implements CommandLineRunner {


    private MongoTemplate mongoTemplate;

    public DataSetReaderProducts(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    // Dropping the products collection in mongodb
    @Override
    public void run(String... args) throws IOException {
        this.mongoTemplate.dropCollection(Products.class);

        // Add data from json file in mongodb

        try {

            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            TypeReference<List<Products>> typeReference = new TypeReference<List<Products>>(){};

            InputStream inputStream = classLoader.getResourceAsStream("json/products.json");

            InputStreamReader isR = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(isR);
            StringBuffer buffer = new StringBuffer();

            String line = "";
            while( (line = reader.readLine()) != null ){
                buffer.append(line);
            }

            MongoClient client = new MongoClient("localhost");
            MongoCollection<Document> collection = client.getDatabase("warehouse").getCollection("products");
            Document doc = Document.parse(buffer.toString());
            collection.insertOne(doc);

//            List<Document> products = mapper.readValue(inputStream,typeReference);
//            System.out.println(products);











             System.out.println("Products saved!");
        } catch(IOException e) {
            System.out.println("Not able to save products: " + e.getMessage());
        }









    }

}
