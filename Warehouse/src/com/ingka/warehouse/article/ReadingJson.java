package com.ingka.warehouse.article;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ingka.warehouse.product.Product;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadingJson {

        private static final ObjectMapper mapper = new ObjectMapper();

        private static void traverse(JsonNode node, int level) {
        if (node.getNodeType() == JsonNodeType.ARRAY) {
            traverseArray(node, level);
        } else if (node.getNodeType() == JsonNodeType.OBJECT) {
            traverseObject(node, level);
        } else {
            throw new RuntimeException("Not yet implemented");
        }
    }

    private static void traverseObject(JsonNode node, int level) {
        node.fieldNames().forEachRemaining((String fieldName) -> {
            JsonNode childNode = node.get(fieldName);
            printNode(childNode, fieldName, level);
            //for nested object or arrays
            if (traversable(childNode)) {
                traverse(childNode, level + 1);
            }
        });
    }

    private static void traverseArray(JsonNode node, int level) {
        for (JsonNode jsonArrayNode : node) {
            printNode(jsonArrayNode, "arrayElement", level);
            if (traversable(jsonArrayNode)) {
                traverse(jsonArrayNode, level + 1);
            }
        }
    }

    private static boolean traversable(JsonNode node) {
        return node.getNodeType() == JsonNodeType.OBJECT ||
                node.getNodeType() == JsonNodeType.ARRAY;
    }

    private static void printNode(JsonNode node, String keyName, int level) {
        if (traversable(node)) {
            System.out.printf("%" + (level * 4 - 3) + "s|-- %s=%s type=%s%n",
                    "", keyName, node.toString(), node.getNodeType());

        } else {
            Object value = null;
            if (node.isTextual()) {
                value = node.textValue();
            } else if (node.isNumber()) {
                value = node.numberValue();
            }//todo add more types
            System.out.printf("%" + (level * 4 - 3) + "s|-- %s=%s type=%s%n",
                    "", keyName, value, node.getNodeType());
        }
    }



        public static void main(String[] args) {

            Product products = new Product();

            try {


                JsonNode root = mapper.readTree(new File("c:\\app-win\\json\\products.json"));
//                JsonNode rootNode = root;
                JsonNode productsNode = root.path("products");
//                System.out.println(productsNode); // [{"productnaam":"bakfiets","productid:":"1"}]
                System.out.printf("root: %s type=%s%n", root, root.getNodeType());
                traverse(root, 1);





/*


                for (JsonNode items : productsNode) {

                    Iterable<JsonNode> iterable = () -> items.elements();
                    iterable.forEach(elem -> System.out.println(elem.asText()));

                    JsonNode containArticles = productsNode.findValue("contain_articles").get(0);
                    JsonNode containArticles2 = productsNode.findPath("contain_articles").findValue("art_id");

                    for (JsonNode articles : containArticles) {
                        System.out.println(articles);
                    }

                    System.out.println(containArticles);
                    System.out.println(containArticles2);
                }
*/









//                for(JsonNode item2 : item) {
//
//                    System.out.println(item2);
//                    System.out.println(item2.get("name"));
//
//                }



                /*

                String resultOriginal = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
                System.out.println("Before Update " + resultOriginal);

                // 1. Update id to 1000
                ArrayNode updateProductsNode = mapper.createArrayNode();

                ObjectNode updateProductsNode1 = mapper.createObjectNode().objectNode();
                updateProductsNode1.put("productnaam", "Bankstel");
                updateProductsNode1.put("productid", 49.9);

                ObjectNode updateProductsNode2 = mapper.createObjectNode().objectNode();
                updateProductsNode2.put("productnaam", "Plant");
                updateProductsNode2.put("productid", 59.9);

                updateProductsNode.add(updateProductsNode1);
                updateProductsNode.add(updateProductsNode2);
                ((ObjectNode) root).set("products", updateProductsNode);

*/

//                ((ArrayNode) productsNode).add(0, "bakfiets");
                //((ObjectNode) root).put("productnaam", "stompertje");
/*
                // 2. If middle name is empty , update to M
                ObjectNode nameNode = (ObjectNode) root.path("name");
                if ("".equals(nameNode.path("middle").asText())) {
                    nameNode.put("middle", "M");
                }

                // 3. Create a new field in nameNode
                nameNode.put("nickname", "mkyong");

                // 4. Remove last field in nameNode
                nameNode.remove("last");

                // 5. Create a new ObjectNode and add to root
                ObjectNode positionNode = mapper.createObjectNode();
                positionNode.put("name", "Developer");
                positionNode.put("years", 10);
                ((ObjectNode) root).set("position", positionNode);

                // 6. Create a new ArrayNode and add to root
                ArrayNode gamesNode = mapper.createArrayNode();

                ObjectNode game1 = mapper.createObjectNode().objectNode();
                game1.put("name", "Fall Out 4");
                game1.put("price", 49.9);

                ObjectNode game2 = mapper.createObjectNode().objectNode();
                game2.put("name", "Dark Soul 3");
                game2.put("price", 59.9);

                gamesNode.add(game1);
                gamesNode.add(game2);
                ((ObjectNode) root).set("games", gamesNode);

                // 7. Append a new Node to ArrayNode
                ObjectNode email = mapper.createObjectNode();
                email.put("type", "email");
                email.put("ref", "abc@mkyong.com");

                JsonNode contactNode = root.path("contact");
                ((ArrayNode) contactNode).add(email);*/
/*

                String resultUpdate = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
//                mapper.writeValue(new File("c:\\app-win\\json\\userupdated.json"), root);

                System.out.println("After Update " + resultUpdate);

*/


            } catch (JsonGenerationException e) {
                e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }



