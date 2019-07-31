package com.ranokuhl;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public void setModel(String model){

        String validModel = model.toLowerCase();

        if(validModel == "carrera" || validModel == "holden"){

            this.model = model;

        }else {

            System.out.println("Unknown model");
        }
    }

    public String getModel(){

        return this.model;

    }






}
