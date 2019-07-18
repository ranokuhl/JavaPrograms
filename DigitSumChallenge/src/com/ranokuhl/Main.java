package com.ranokuhl;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(1));
        System.out.println(sumDigits(12));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(501));
        System.out.println(sumDigits(77382));
        System.out.println(sumDigits(378288));
        System.out.println(sumDigits(10));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        // process number
        // return sum of all digits
        // return number = number / 10; // gets everything before last digit
        // return number = number / 5;
        // return number % 10; // gets last digit

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }
        return sum;

    }
}
