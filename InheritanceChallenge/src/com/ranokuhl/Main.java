package com.ranokuhl;

public class Main {

    public static void main(String[] args) {

        Model Outlander = new Model(36);

        Outlander.steer(45);

        Outlander.accelerate(30);
        Outlander.accelerate(20);
        Outlander.accelerate(-42);
    }

}
