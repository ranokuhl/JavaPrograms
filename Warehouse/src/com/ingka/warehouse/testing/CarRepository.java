package com.ingka.warehouse.testing;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ingka.warehouse.testing.Car;

import java.io.File;
import java.io.IOException;

public class CarRepository {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        File jsonObject  = new File("C:\\app-win\\json\\car.json");

        Car car = mapper.readValue(jsonObject, Car.class);

        String prettyInventory = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);
        System.out.println(prettyInventory);


    }

}
