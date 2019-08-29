package com.ingka.warehouse.engine;

import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RemoveJsonValue {

    public static void main(String[] args) throws IOException {



        // read json from file to JsonNode
        StringBuilder jsonContent = new StringBuilder();
        Path inputPath = Paths.get("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/array.json");
        System.out.println(jsonContent);
//        Files.lines(inputPath).forEach(jsonContent::append);
//        JsonNode rootNode = new ObjectMapper(new JsonFactory())
//                .readTree(jsonContent.toString());
/*

        System.out.println("Before:");
        System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter()
                .writeValueAsString(rootNode));

*/
        // remove json node - name
//        ((ObjectNode) rootNode).remove("");
/*

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
        }
    }
}