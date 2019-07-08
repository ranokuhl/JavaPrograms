package com.ranokuhl;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is " +
                " another " +
                " still more.");

        // Don't do this one-line, make it readable.
        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");
    }
}
