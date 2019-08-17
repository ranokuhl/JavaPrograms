package com.ranokuhl;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] myIntegers = getInteger(5);

        for (int i = 0; i < myIntegers.length ; i++) {

            System.out.println("Element " + i + " has value of " + myIntegers[i]);
        }

        System.out.println("Average sum is " + getAverageInt(myIntegers));

    }


    public static int[] getInteger(int number) {

        System.out.println("Enter a number: \r");

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {

            values[i] = scanner.nextInt();
        }

        return values;

    }

    public static double getAverageInt(int[] number) {

        int sum = 0;

        for (int i = 0; i < number.length; i++) {

            sum += number[i];

        }

        return sum / (double) number.length;


    }





}
