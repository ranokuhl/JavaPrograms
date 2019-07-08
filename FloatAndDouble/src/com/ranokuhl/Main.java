package com.ranokuhl;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 ( 4 bytes )
        int myIntValue = 5;

        // width of float = 32 ( 4 bytes)
        float myFloatValue = 5f;

        // width of double = 64 ( 8 bytes )
        double myDoubleValue = 5d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        // 1 pound is equal to = 0.45359237 kilograms
        double myNumberOfPounds = 5d;
        double fromPoundsToKilograms = myNumberOfPounds * 0.45359237d;
        System.out.println(fromPoundsToKilograms);

    }
}
