package com.ranokuhl;

public class Main {

    public static void main(String[] args) {

        for (int x = 2; x < 9; x++) {

            System.out.println("10.000 at " + x + " % interest = " + String.format("%.2f", calculateInterest(10_000, x)));

        }

        System.out.println("===============================");

        for (int x = 8; x > 1; x--) {

            System.out.println("10.000 at " + x + " % interest = " + String.format("%.2f", calculateInterest(10_000, x)));

        }



        




    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
