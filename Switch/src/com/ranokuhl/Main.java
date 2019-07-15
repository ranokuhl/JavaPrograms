package com.ranokuhl;

public class Main {

    public static void main(String[] args) {

        char myLetter = 'E';

        switch (myLetter) {

            case 'A':
                System.out.println("Found letter: " + myLetter);
                break;

            case 'B':
                System.out.println("Found letter: " + myLetter);
                break;

            case 'C':
                System.out.println("Found letter: " + myLetter);
                break;

            case 'D':
                System.out.println("Found letter: " + myLetter);
                break;

            case '\u0045':
                System.out.println("Found letter: " + myLetter);
                break;

            default:
                System.out.println("Letter not found");


        }

    }
}
