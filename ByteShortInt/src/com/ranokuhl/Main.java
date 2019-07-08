package com.ranokuhl;

public class Main {

    public static void main(String[] args) {

        // 1.
        byte myByte = -128;

        // 2.
        short myShort = -32768;

        // 3.
        int myInt = -2_147_483_648;

        // 4.
        long myLong = 50_000L + 10 * (myByte + myShort + myInt);
        System.out.println(myLong);
    }
}
