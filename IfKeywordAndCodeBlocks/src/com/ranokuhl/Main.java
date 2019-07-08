package com.ranokuhl;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000, but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        }
//        else {
//            System.out.println("Got here");
//        }

//        if (gameOver == true) {
        if (gameOver) {
            int finalScore  = score + (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
        }

        System.out.println("=====================================");

        // Print out a second score on the screen with the following
        // score set to 10_000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

//        boolean myGameOver = true;
//        int myScore = 10_000;
//        int myLevelCompleted = 8;
//        int myBonus = 200;
//
//        if (myGameOver) {
//            int finalScore = myScore + (myLevelCompleted * myBonus);
//            System.out.println("Your finalScore is: " + finalScore);
//        }

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore  = score + (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
        }






    }
}
