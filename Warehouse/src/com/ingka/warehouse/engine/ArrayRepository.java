package com.ingka.warehouse.engine;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRepository {


    public static void main(String[] args) throws IOException {

       // ObjectMapper mapper = new ObjectMapper();


        // File jsonFile = new File("c:\\app-win\\json\\products.json");

/*
        FileInputStream jsonFile;


*/
        ObjectMapper mapper = new ObjectMapper();
        //String json = "[{\"name\":\"mkyong\", \"age\":37}, {\"name\":\"fong\", \"age\":38}]";
        File jsonFile = new File("/home/rano/code/ranokuhl/JavaPrograms/Warehouse/libs/array.json");

        try {

            // 1. convert JSON array to Array objects
            Person[] pp1 = mapper.readValue(jsonFile, Person[].class);

            System.out.println("JSON array to Array objects...");
            for (Person person : pp1) {
                System.out.println(person);
            }

            // 2. convert JSON array to List of objects
            List<Person> ppl2 = Arrays.asList(mapper.readValue(jsonFile, Person[].class));

            List<String> itemList = new ArrayList<>();

            ppl2.stream().forEach(x -> itemList.add(x.getName()));

            System.out.println("Itemlist: " + itemList);
            System.out.println(itemList.remove(0+1) + " has been removed");
            System.out.println("Itemlist: " + itemList);






            System.out.println("\nJSON array to List of objects");
            //ppl2.stream().forEach(x -> System.out.println(x));
            System.out.println("++++++++++++++++++++++");
            ppl2.stream().findAny().get().setName("bebop");
            System.out.println(ppl2.stream().findFirst());
            System.out.println("++++++++++++++++++++++");

            // 3. alternative
            List<Person> pp3 = mapper.readValue(jsonFile, new TypeReference<List<Person>>() {});
            System.out.println("pp3: " + pp3.toString());

            System.out.println("\nAlternative...");
            pp3.stream().forEach(x -> System.out.println(x));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
