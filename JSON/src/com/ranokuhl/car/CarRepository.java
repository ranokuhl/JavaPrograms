package com.ranokuhl.car;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class CarRepository {

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("blue", "renault");

        try {
            objectMapper.writeValue(new File("c:\\app-win\\car.json"), car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
