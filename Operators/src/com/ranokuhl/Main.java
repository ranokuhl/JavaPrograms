package com.ranokuhl;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an Alien!");

        int topScore = 80;
        if (topScore != 100) // no output other options <=, >=, <, >
            System.out.println("You got the highscore!");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100.");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("Topscore is true for one of the conditions");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to happen.");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true.");

        System.out.println("=============================================");


        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //    If the remaining total (#4) is equal to 20 or less.

        // 1.
        double myFirstDouble = 20d;
        System.out.println("myFirstDouble: " + myFirstDouble);

        // 2.
        double mySecondDouble = 80d;
        System.out.println("mySecondDouble: " + mySecondDouble);

        // 3.
        double myTotal = (myFirstDouble + mySecondDouble) * 25d;
        System.out.println("(myFistDouble + mySecondDouble) divided by 25: " + myTotal);

        // 4.
        double myRemainder = myTotal % 40;
        System.out.println("The remainder of myTotal is: " + myRemainder);

        // 5.
        if (myRemainder <= 20) {

            System.out.println("Total was over the limit");
        }






    }
}
