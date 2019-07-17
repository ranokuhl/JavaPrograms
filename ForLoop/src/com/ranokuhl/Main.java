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

        System.out.println("===============================");

        int count = 0;

        for (int i = 25; i < 90; i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number.");

                if (count == 3) {
                    System.out.println("Exiting program after 3 prime numbers found.");
                    break;
                }
            }
        }




    }

    public static boolean isPrime(int n){

        if (n == 1) {
            return false;
        }

        for (int i = 2;i <= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
