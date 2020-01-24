package com.ranokuhl.warehouse.services;

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

        // Dropping the inventory collection in mongodb

        // Add data from json file in mongodb
        try {

            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

            ObjectMapper mapper = new ObjectMapper();

            InputStream inputStreamProducts = classLoader.getResourceAsStream("json/product.json");

            Product[] product = mapper.readValue(inputStreamProducts, Product[].class);
//            Parts[] parts;

            MongoClient client1 = new MongoClient("localhost");
            client1.dropDatabase("warehouse");
//            MongoDatabase mongoDatabase = client1.getDatabase("warehouse");
//            MongoCollection<Document> collectionProduct = mongoDatabase.getCollection("product");
//
//            for (Product valueProduct: product) {
//                collectionProduct.insertOne(valueProduct);
//            }

//          ## Start Morphia part
//
            Morphia morphia = new Morphia();
            morphia.map(Product.class);

            Datastore datastore = morphia.createDatastore(client1, "warehouse");
//            datastore.ensureIndexes();

            for (Product valueProducts : product) {
                datastore.save(valueProducts);
            }

//          ## End Morphia Part





//            MongoDatabase mongoDatabase = client1.getDatabase("warehouse");
//            MongoCollection<Document> collectionProduct = mongoDatabase.getCollection("product");


//            MongoCollection<Document> collectionProduct = client1.getDatabase("warehouse").getCollection("product");
//            Map<String, Object > documents = new HashMap<>();




//            System.out.println(Arrays.toString(product));


//            Document doc1 = Document.parse(Arrays.toString(product));
//            collectionProduct.insertMany((List<? extends Document>) doc1);

/*


            mapper.configure(
                    DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

            InputStream inputStreamProducts = classLoader.getResourceAsStream("json/product.json");
            InputStream inputStreamInventory = classLoader.getResourceAsStream("json/inventory.json");



            // Load Inventory json at startup
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

            System.out.println("Inventory loaded!");


            // Load Products Json at startup
            InputStreamReader inputStreamReader = new InputStreamReader(inputStreamProducts);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuffer stringBufferProducts = new StringBuffer();

            String line2 = "";
            while ((line2 = bufferedReader.readLine()) != null) {
                stringBufferProducts.append(line2);
                System.out.println("StringBufferProducts: " + stringBufferProducts);
            }


//            MongoClient client2 = new MongoClient("localhost");
//            MongoTemplate mongoTemplate = new MongoTemplate(client2, "warehouse");
//            System.out.println("StringBufferProducts:" + stringBufferProducts);

//            mongoTemplate.insert(stringBufferProducts);
            MongoClient client2 = new MongoClient("localhost");
            MongoCollection<Document> collectionProducts = client2.getDatabase("warehouse").getCollection("products");
//            Document doc2 = Document.parse(stringBufferProducts.toString());

            // Create List to add the documents in the array
            List<Document> docs2 = new ArrayList<Document>(stringBufferProducts.toString());
            Document addProducts = (Document) stringBufferProducts;

            docs2.add(stringBufferProducts);




//            collectionProducts.insertMany(docs2);


*/

            System.out.println("Products loaded!");
        } catch (Exception e) {
            System.out.println("Not able to load products: " + e.getMessage());
        }
    }
}
