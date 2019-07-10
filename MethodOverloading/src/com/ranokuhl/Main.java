package com.ranokuhl;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Rano", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();


    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            return -1;
        }

        double cm = inches *
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player" + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player then there is not score");
        return 0;
    }

//    public static void calculateScore() {
//        System.out.println("Player" + playerName + " scored " + score + " points.");
//    }



}
