package com.ranokuhl;

public class Main {

    public static void main(String[] args) {

        Kata kata = new Kata();

        System.out.println(kata.countingSheep(3));


    }

}

class Kata {

    public static String countingSheep(int num) {

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 1; i <= num; i++) {

            stringBuilder.append(i).append( "sheep...");
        }

        return stringBuilder.toString();



    }

}
