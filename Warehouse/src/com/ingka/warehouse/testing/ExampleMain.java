package com.ingka.warehouse.testing;

;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import java.io.IOException;

public class ExampleMain {
    public static void main(String[] args) throws IOException {
        String inputJson = "{\"name\":\"Jake\",\"salary\":3000,"
                + "\"address\":{\"street\":\"101 Blue Dr\",\"city\":\"White Smoke\"}}";
        System.out.println("input json: " + inputJson);

        Employee existingEmployee = Employee.of("John", "Dev", 1000, "222-222-222",
                Address.of("101 Blue Dr", "SunBridge", "23456"));
        System.out.println("existing object: " + existingEmployee);
        System.out.println("existing object hashCode: " + System.identityHashCode(existingEmployee));
        System.out.println("existing nested object 'address' hashCode: " + System
                .identityHashCode(existingEmployee.getAddress()));

        ObjectMapper objectMapper = new ObjectMapper();
        ObjectReader objectReader = objectMapper.readerForUpdating(existingEmployee);
        Employee updatedEmployee = objectReader.readValue(inputJson);
        System.out.println("updated object: " + updatedEmployee);
        System.out.println("updated object hashCode: " + System.identityHashCode(updatedEmployee));
        System.out.println("updated nested object 'address' hashCode: " + System
                .identityHashCode(updatedEmployee.getAddress()));

        System.out.println("=================");
        Employee employee = objectMapper.readValue(inputJson, Employee.class);
        System.out.println(employee);

    }
}
