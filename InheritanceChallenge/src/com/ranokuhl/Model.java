package com.ranokuhl;

public class Model extends Car {

    private int roadService;

    public Model(int roadService) {
        super("Model Outlander", "4WD", 4, 5, 6, false);
        this.roadService = roadService;
    }
}
