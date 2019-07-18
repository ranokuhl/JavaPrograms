package com.ranokuhl;

public class Main {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(4));
        System.out.println(isEvenNumber(3));
        System.out.println(isEvenNumber(5));
        System.out.println(isEvenNumber(8));



        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        int count = 0;

        while (number <= finishNumber){

            number++;

            if(!isEvenNumber(number)){
                continue;
            };


            if(evenNumbersFound >= 5){
                break;
            }

            System.out.println("Even number is: " + number);

            evenNumbersFound++;



        }

        System.out.println("Total of even number is: " + evenNumbersFound);

    }






    public static boolean isEvenNumber(int number){

        return number % 2 == 0;
    }
}
