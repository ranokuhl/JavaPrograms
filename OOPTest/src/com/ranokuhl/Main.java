package com.ranokuhl;

public class Main {


    public static void main(String[] args)
    {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");

        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition1("Lettuce", 0.75);
        hamburger.addHamburgerAddition1("Cheese", 1.12);

        System.out.println("Total burger price is : " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 2.50);

        System.out.println("============================");
        System.out.println(healthyBurger.itemizeHamburger());
        healthyBurger.addHamburgerAddition1("Egg", 5.42);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());




    }


}
