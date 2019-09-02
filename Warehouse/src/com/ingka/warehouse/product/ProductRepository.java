package com.ingka.warehouse.product;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class ProductRepository {

    public static void main(String[] args) throws IOException {

        System.out.println("testing");

    }
}


/*      2019/09/02 results

        Contain Articles: [contain_articles, [, {, art_id, 1, amount_of, 4, }, {, art_id, 2, amount_of, 8, }, {, art_id, 3, amount_of, 1, }, contain_articles, [, {, art_id, 1, amount_of, 4, }, {, art_id, 2, amount_of, 5, }, {, art_id, 4, amount_of, 1, }]
        Product name: [Dining Chair, Dinning Table]
        Inventory: [1, 12, 2, 17, 3, 2, 4, 1]



        File PRODUCTS_JSON = new File("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/products.json");

        JsonFactory factory = new JsonFactory();

        JsonParser parser = factory.createParser(PRODUCTS_JSON);

        List<String> containArticles = new LinkedList<>();
        List<String> productName = new LinkedList<>();

        while ((parser.nextToken() != JsonToken.END_OBJECT)) {

            JsonToken token;

            while ((token = parser.nextToken()) != JsonToken.END_ARRAY) {  // products

                String fieldName = parser.getCurrentName();
                // Dining Chair
                // Get dining chair and dining table
                if ("name".equals(fieldName)) {

                    parser.nextToken();
                    productName.add(parser.getText());
                    while (parser.nextToken() != JsonToken.END_ARRAY) {  // contain_articles

                        containArticles.add(parser.getText());

                        if ("contain_articles".equals(fieldName)) {
                            parser.nextToken();
                            productName.add(parser.getText());
                        }
                    }

                }
            }

            System.out.println("Contain Articles: " + containArticles);
            System.out.println("Product name: " + productName);

            File INVENTORY_JSON = new File("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/inventory.json");

            JsonParser parser2 = factory.createParser(INVENTORY_JSON);

            List<String> inventory = new LinkedList<>();

            JsonToken token2 = parser2.nextToken();
            token2 = parser2.nextToken();

            if (token2 == JsonToken.FIELD_NAME && "inventory".equals(parser2.getCurrentName())) {

                token2 = parser2.nextToken(); // // Read left bracket i.e. [
                // Loop to print array elements until right bracket i.e ]
                while (token2 != JsonToken.END_ARRAY) {
                    token2 = parser2.nextToken();

                    if ("art_id".equals(parser2.getCurrentName()) && token2 == JsonToken.VALUE_STRING) {
                        inventory.add(parser2.getText());
                    }

                    if ("stock".equals(parser2.getCurrentName()) && token2 == JsonToken.VALUE_STRING) {
                        inventory.add(parser2.getText());
                    }

/*                if (token == JsonToken.VALUE_STRING) {
//                    System.out.print(parser2.getText() + ", ");
                inventory.add(parser2.getText());
            }*/
/*
                }
            }
            System.out.println("Inventory: " + inventory);
        }

    }}



/*



        List<String> inventory = new LinkedList<>();


        while(parser2.nextToken() != JsonToken.END_OBJECT) {

            String fieldName2 = parser2.getCurrentName();

            if("inventory".equals(fieldName2)) {


                if(parser2.nextToken() == JsonToken.START_ARRAY) {

                    while(parser2.nextToken() != JsonToken.END_ARRAY) {
                        inventory.add(parser2.getText());
                    }
                }
            }
        }






        System.out.println(inventory);

*/





//
//
//            JsonToken token;
//            while((token = parser.nextToken()) != null) {
//
//                if(token.isScalarValue()) {
//
//                    String currentName  = parser.getCurrentName();
//
//                        if (currentName != null) {
//                            String text = parser.getText();
//                            System.out.printf("%s: %s%n", currentName, text);
//                        }
//
//                }
//
//                System.out.println(token);
//                System.out.println(parser.getText());
//
//
//            }
//        }
//
//
//    }
//}
//
/*

        2019/09/01 - results

        ObjectMapper mapper = new ObjectMapper();
        mapper.setDefaultPropertyInclusion(
                JsonInclude.Value.construct(JsonInclude.Include.ALWAYS, JsonInclude.Include.NON_NULL));

        // File jsonFile = new File("c:\\app-win\\json\\products.json");
        FileInputStream jsonFileProducts = new FileInputStream("c:\\app-win\\json\\products.json");
        FileInputStream jsonFileInventory= new FileInputStream("c:\\app-win\\json\\inventory.json");

        Products currentProducts = mapper.readValue(jsonFileProducts, Products.class);
        ProductInventory currentInventory = mapper.readValue(jsonFileInventory, ProductInventory.class);

        System.out.println("Current Products" + currentProducts.getProducts().get(0).getContainArticles());
        System.out.println("Current Inventory: " + currentInventory.getInventory());
        System.out.println("======== using set =========");

        Set myInventoryList = currentInventory.getInventory();
        Set<String> test = new HashSet<>(myInventoryList);
        test = mapper.readValue(jsonFileInventory, Set.class);

        for (Iterator<String> iterator = test.iterator();iterator.hasNext();) {
            String testPrint = (String) iterator.next();
            System.out.println(testPrint);

//            String prettyProducts = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(myInventoryList);
//            System.out.println("Pretty String Merge List:\n" + prettyProducts);
*/






//
//
//        Map<String, String> myMap = new HashMap<String, String>(currentProducts.getProducts().get(0).getContainArticles());
//        System.out.println("my map : " + myMap);
//
//        System.out.println("myProductList : " + myProductList);
//        System.out.println("myInventoryList : " + myInventoryList);

//        System.out.println("========Array list checking ============");



//        ArrayList<String> myProducts = new ArrayList(myProductList);
//        ArrayList<String> myInventory = new ArrayList(myInventoryList);

//        System.out.println("myProductList is Object array?" + myProductList);
//        String[] str = GetStringArray(myProductList);
//        System.out.println("String Array[]: " + Arrays.toString(str));
//        System.out.println("myInventoryList is Object array?" + myInventory);

//        List<String> noDup = Stream.concat(myProducts.stream(), myInventory.stream())
////                .distinct()
////                .collect(Collectors.toList());
////        for (String s : noDup) {
////            System.out.println(s);
////        }

//        System.out.println("======== Array String Set ==============");
//        List<String> strings = myProducts.stream()
//                .map(object -> Objects.toString(object, null))
//                .collect(Collectors.toList());
//        System.out.println("Strings : " + strings);


/*        System.out.println("======== using Set ==============");

//        Set<String> set = new LinkedHashSet<>(myProducts);
//        set.addAll(myInventory);
//        List<String> combinedList = new ArrayList<>(set);
//
//        System.out.println("List Combined: " + combinedList);
//
//        List<String> listTwoCopy = new ArrayList<>(myInventory);
//        listTwoCopy.removeAll(myProducts);
//        myProducts.addAll(listTwoCopy);
//
//        System.out.println("myProducts combined: " + myProducts);


        System.out.println("=========================");*/



/*        myInventory.removeAll(myProducts);
//        System.out.println(myInventory);
        myInventory.addAll(myProducts);
//        System.out.println(myInventory);*/

//        //System.out.println("myinventory sort :");
//        String prettyProducts = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(myProducts);
//        System.out.println("Pretty String Merge Product List:\n" + prettyProducts);
//
//        String prettyProducts2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(myInventoryList);
//        System.out.println("Pretty String Merge Inventory List:\n" + prettyProducts2);


/*
        List<String> combinedList = Stream.of(myProducts, myInventory)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println("Combined list: " + combinedList);
*/

/*
        Set<String> set = new LinkedHashSet<>(myProducts);
        set.addAll(myInventory);
        List<String> combinedList = new ArrayList<>(set);

        System.out.println("List Combined: " + combinedList);

        List<String> listTwoCopy = new ArrayList<>(myInventory);
        listTwoCopy.removeAll(myProducts);
        myProducts.addAll(listTwoCopy);

        System.out.println("myProcuts combined: " + myProducts);
*/




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


/*    public static String[] GetStringArray(ArrayList<String> arr)
    {

        // declaration and initialise String Array
        String str[] = new String[arr.size()];

        // ArrayList to Array Conversion
        for (int j = 0; j < arr.size(); j++) {

            // Assign each value to String array
            str[j] = arr.get(j);
        }

        return str;
    }*/





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
