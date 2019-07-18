package com.ranokuhl;

public class Main {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(4));
        System.out.println(isEvenNumber(3));
        System.out.println(isEvenNumber(5));
        System.out.println(isEvenNumber(8));

    }

    public static boolean isEvenNumber(int number){

        if(number % 2 == 0){
            return true;
        }
        return false;
    }
}
