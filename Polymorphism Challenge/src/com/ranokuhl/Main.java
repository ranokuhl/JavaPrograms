package com.ranokuhl;

class Car {

    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;


    public Car(int cylinders, String name) {

        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;

    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Engine started.";
    }

    public String accelerate() {
        return "A car accelerated";
    }

    public String brake() {
        return "A car hits the brake.";
    }
}


class Toyota extends Car {

    public Toyota() {
        super(4, "Toyota");
    }

    @Override
    public String startEngine() {
        return "Toyota engine started";
    }

    @Override
    public String accelerate() {
        return getName() + " accelerated.";
    }
}


class Saab extends Car {

    public Saab() {

        super(2, "Saab");
    }

    @Override
    public String startEngine() {
        return getName() + " started engine.";
    }

    @Override
    public String accelerate() {
        return getName() + " has accelerated.";
    }

}


public class Main {

    public static void main(String[] args) {

        Car car = new Car(6, "base car");

        System.out.println("Car name: " + car.getName());
        System.out.println("Amount of cylinders: " + car.getCylinders());
        System.out.println("Engine: " + car.startEngine());
        System.out.println("Accelerated: " + car.accelerate());
        System.out.println("=================================");

        Car car1 = new Toyota();
        System.out.println("Car name: " + car1.getName());
        System.out.println("Amount of cylinders: " + car1.getCylinders());
        System.out.println("Engine: " + car1.startEngine());
        System.out.println("Accelerated: " + car1.accelerate());
        System.out.println("=================================");

        Car car2 = new Saab();

        System.out.println("Car name: " + car2.getName());
        System.out.println("Amount of cylinders: " + car2.getCylinders());
        System.out.println("Engine: " + car2.startEngine());
        System.out.println("Accelerated: " + car2.accelerate());
        System.out.println("=================================");


    }
}