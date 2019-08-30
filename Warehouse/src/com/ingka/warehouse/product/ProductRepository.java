package com.ingka.warehouse.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {



    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.setDefaultPropertyInclusion(
                JsonInclude.Value.construct(JsonInclude.Include.ALWAYS, JsonInclude.Include.NON_NULL));

        // File jsonFile = new File("c:\\app-win\\json\\products.json");
        FileInputStream jsonFileProducts = new FileInputStream("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/products.json");
        FileInputStream jsonFileInventory= new FileInputStream("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/inventory.json");

        Products currentProducts = mapper.readValue(jsonFileProducts, Products.class);
        ProductInventory currentInventory = mapper.readValue(jsonFileInventory, ProductInventory.class);

        System.out.println("Current Products" + currentProducts.getProducts().get(0).getContainArticles().toString());
        System.out.println("Current Inventory: " + currentInventory);

        List myProductList = currentProducts.getProducts().get(0).getContainArticles();
        //List myInventoryList = currentInventory.getInventory();
        ArrayList myProducts = new ArrayList(myProductList);
       // ArrayList myInventory = new ArrayList(myInventoryList);
//        System.out.println("MyInventory: " + myInventory);
//        System.out.println("MyProducts: " + myProductList);

        //myProductList.addAll(myInventoryList);
        // System.out.println("Merge List: " + myProductList);

//        String prettyProducts = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(myProductList);
//        System.out.println("Pretty String Merge List:\n" + prettyProducts);

//        Iterator it = myProducts.iterator();
//
//        while(it.hasNext()) {
//            Object element = it.next();
//            System.out.println(element + " ");
//        }



/*

        System.out.println("+++++++++++ Printing products - Before Merge +++++++++++\n");
        // System.out.println("currentProducts: \n" + currentProducts);
        System.out.println("Product Name: " + currentProducts.getProducts().get(0).getName());
        System.out.println("Contains: " + currentProducts.getProducts().get(0).getContainArticles().get(1).getAmountOf());
        System.out.println("In stock: " + currentProducts.getProducts().get(0).getContainArticles().get(1).getInventory()); // gives "In Stock: null"
        //System.out.println("ToString: \n" + currentProducts.toString());
        System.out.println("++++++++++++++++++++++");

        ObjectMapper objectMapper = new ObjectMapper();
        FileInputStream jsonFile2 = new FileInputStream("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/inventory.json");

        ObjectReader objectReader = objectMapper.readerForUpdating(currentProducts);
        Products updatedProducts = objectReader.readValue(jsonFile2);
        System.out.println("current products object: " + currentProducts);
        System.out.println("updated object: " + updatedProducts);
        System.out.println("updated object hashCode: " + System.identityHashCode(updatedProducts));
        System.out.println("updated nested object 'address' hashCode: " + System
                .identityHashCode(updatedProducts.getProducts().get(0).getContainArticles().get(0).getInventory()));

*/
//                System.identityHashCode(updatedProducts.getProducts().get(0).getContainArticles().get(0).getInventory().getName())
//                + System.identityHashCode(updatedProducts.getProducts().get(0).getContainArticles().get(0).getInventory().getStock()));

//        System.out.println("art_id \n" + currentProducts.getProducts().get(1).getContainArticles().get(0).getArtId());
//        System.out.println("Amount_of \n" + currentProducts.getProducts().get(1).getContainArticles().get(0).getAmountOf());
//        String amountString = currentProducts.getProducts().get(1).getContainArticles().get(0).getAmountOf();
//
//        Integer amount = Integer.valueOf(amountString);
//
//        int addStock = 4;
//
//        int result = amount + addStock;
//
//        System.out.println(result);


        //System.out.printf("amount_of: \n" + currentProducts);


        //System.out.println(product.getProducts().get(0).toString());


                //mapper.createArrayNode(product.getProducts());
//        Array myArray[] = new Array[product.getProducts()];

//        for(int i = 0; new Array(); i++) {
//            System.out.println(" - " + a);
//        }
/*

        for (Product a : product.getProducts()) {

            System.out.println("a: " + a.getContainArticles());

        }



        System.out.println("==== Array node ====");
        ArrayNode array = mapper.createArrayNode();

        int i = 0;
        while (i < 6) {
            array.add(mapper.createArrayNode().add("" + i++).add("" + i++));
        }
        System.out.println(array);
        System.out.println("=================");


        System.out.println("");
        System.out.println("Product name: " + product.getProducts().get(0).getName());
        System.out.println("Product: " + product.getProducts().get(0).getName());
        System.out.println("Article number: " + product.getProducts().get(0).getContainArticles().get(0));
        System.out.println("Amount: " + product.getProducts().get(0).getContainArticles().get(1));

*/

//        List myArray = product.getProducts();
//        System.out.println("My Arrray: " + myArray);

/*

        String prettyProducts = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(product );
        System.out.println("Pretty String:\n" + prettyProducts);

        System.out.println("==================");

*/
//        System.out.println("name: " + product.getName());
//        System.out.println("articles : " + product.getContain_articles());
//        System.out.println("Contain: " + product.getProducts().get);


        //jsonFile.close();

        //String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(product);

        //System.out.println(prettyStaff1);
    }
}




/*        JsonNode root = mapper.readTree(jsonFile);

        for(JsonNode root2 : root) {
            System.out.println("Products: " + root2);

            System.out.println("===============\n");

            JsonNode rootProducts = root.path("products");

            for(JsonNode printProducts : rootProducts) {
                System.out.println("Name: " + printProducts.path("name").asText());
                System.out.println("contain: " + printProducts);
                System.out.println("contain articles: " + printProducts.findValue("contain_articles"));*/

/*              JsonNode rootContainArticles = root2.path("contain_articles");
                System.out.println("rootconainterarticles:" + rootContainArticles);

                for (JsonNode printContainArticles : rootContainArticles) {
                    System.out.println("Products : " + printContainArticles.path("contain_articles").asText());
                }*/
//            }
//        }
/*

        JsonNode jsonNodeRoot = objectMapper.readTree(jsonFile);
        System.out.println("JsonNodeRoot: " + jsonNodeRoot);

        JsonNode nodeProducts = jsonNodeRoot.path("products");

        System.out.println("=====================");

        //System.out.println(nodeProducts);

        for (JsonNode nodeProduct : nodeProducts) {
            String name = nodeProduct.path("name").asText();
            System.out.println("++++++++++++++++++++++++");
            System.out.println("nodeProduct: " + nodeProduct.getNodeType());


            System.out.println("Product name: " + name);
            System.out.println("Items in stock: " + nodeProduct.path("contain_articles").findPath("amount_of"));
            System.out.println("++++++++++++++++++++++++");



*/




//            Map<String, String> resourceMap = mapper.convertValue(nodeProduct, Map.class);
//            for(Object value : resourceMap.values()) {
//                System.out.println("Value: " + value);
//                for(String values : value.toArray() {
//                    System.out.println(values);
//                }
//            };
//            System.out.println("ResourceMap type: " + resourceMap.getClass());
//            System.out.println("ResourceMap: " + resourceMap);
//            System.out.println("Resource name: " + resourceMap.get("name"));
            // System.out.println("Resource name: " + resourceMap.get("contain_articles"));









            // Dining chair needs 4 legs, 8 screws, 1 seat



            // Dining table needs 4 legs, 8 screws, 1 tabletop



//        }





//        JsonNode contactNode = jsonNodeRoot.path("products");
//        if (contactNode.isArray()) {
//
////            System.out.println("Is this node an Array? " + contactNode.isArray());
//
//            System.out.println("++++ Current Products ++++\n");
//            for (JsonNode node : contactNode) {
//                String name = node.path("name").asText();
//                String contain_articles = node.path("contain_articles").asText();
//                System.out.println(name);
//                System.out.println(contain_articles);
//            }
//        }

//        JsonNode node2 = new ObjectMapper().readTree(jsonFile);
//
//
//
//
//        if (node2.isArray()) {
//
//            for (JsonNode innerNode : node2) {
//                String art_id = innerNode.path("art_id").asText();
//                String amount_of = innerNode.path("amount_of").asText();
//                System.out.println("article id: " + art_id);
//                System.out.println("amount_of: " + amount_of);
//            }
//        }



//        JsonNode contain_articlesNode = jsonNodeRoot.path("contain_articles");
//        Iterator<JsonNode> iterator = contain_articlesNode.elements();
//
//        while (iterator.hasNext()) {
//            JsonNode contain_articles = iterator.next();
//            System.out.println(contactNode.asText());
//        }



//        if (contain_articlesNode.isArray()) {
//
//            for (JsonNode innerNode : contain_articlesNode) {
//                String art_id = innerNode.path("art_id").asText();
//                String amount_of = innerNode.path("amount_of").asText();
//                System.out.println("article id: " + art_id);
//                System.out.println("amount_of: " + amount_of);
//            }
//        }
   // }
//}
