package com.ranokuhl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] firstArray = {1,2,3,4,5};

        System.out.println("Initial array: " + Arrays.toString(firstArray));

        reverse(firstArray);

        System.out.println("After sort array: " + Arrays.toString(firstArray));

    }

    private static void reverse(int[] array) {

        int maxIndex = array.length-1;
        int halfLength = array.length/2;

        for (int i = 0; i < halfLength; i++) {

            int temp = array[i];

            array[i] = array[maxIndex -i];

            array[maxIndex -i] = temp;
        }
    }
}
