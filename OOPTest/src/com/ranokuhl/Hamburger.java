package com.ranokuhl;

public class Hamburger {

    private String name;
    private String breadRollType;
    private double price;
    private String meat;

    private String additionName1;
    private double additionPrice1;

    private String additionName2;
    private double additionPrice2;

    private String additionName3;
    private double additionPrice3;

    private String additionName4;
    private double additionPrice4;

    public Hamburger(String name, String breadRollType, double price, String meat) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.price = price;
        this.meat = meat;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.additionName1 = name;
        this.price = price;
    }
}
