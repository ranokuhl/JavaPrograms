package com.ingka.warehouse.article;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ArticleRepository {


    public static void main(String[] args) throws IOException {

        // create ObjectMapper instance
        ObjectMapper mapper = new ObjectMapper();

        JsonNode root = mapper.readTree(new File("c:\\app-win\\json\\inventory.json"));

        System.out.println(root);

        JsonFactory factory = mapper.getFactory();
        System.out.println(factory);


//        JsonNode inventory = root.get("inventory");
//        // System.out.println("Is inventory object?" + inventory.isArray());
//        System.out.println(inventory);


//
//        // read json file
//        File file = new File("c:\\app-win\\json\\inventory.json");
//
//        // convert json string to Object
//        Article article = mapper.readValue(file, Article.class);
//
//        List<Article> articles = mapper.reader().forType(new TypeReference<List<?>>() {}).readValue(file);
//        System.out.println();
//
//
//        System.out.println("Article object\n" + article.toString());







        // JSON file to Java object


        // JSON String to Java Object
//        String jsonInString = "{\"name\":\"mkyong\",\"age\":37,\"skills\":[\"java\",\"python\"]}";
//        Article staff2 = mapper.readValue(jsonInString, Article.class);
//
//
//        String printArticle = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff2);






    }
}
