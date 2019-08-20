package com.ranokuhl;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int[] myArray = readIntegers(5);
        System.out.println(findMin(myArray));
    }


    private static int[] readIntegers(int count) {

        int[] myCount = new int[count];

        System.out.println("Enter number: \r");

        for (int i = 0; i < myCount.length; i++) {

            myCount[i] = scanner.nextInt();

        }
        return myCount;
    }

    private static int findMin(int[] array) {

        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < minValue) {

                minValue = array[i];
            }
        }

        return minValue;
    }


}
