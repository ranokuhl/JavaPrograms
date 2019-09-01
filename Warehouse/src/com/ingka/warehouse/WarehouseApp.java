/*
package com.ingka.warehouse;

import java.util.Scanner;

public class WarehouseApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        startApp();
        printActions();
        while(!quit) {

            System.out.println("\nEnter action: (6 available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }


    private static void startApp() {
        System.out.println("Starting app..");
    }


    private static void printActions() {
        System.out.println("Available actions: \npress");
        System.out.println("0 - Quit\n" +
                "1 - List inventory\n" +
                "2 - Add a new product\n" +
                "3 - Update a product\n" +
                "4 - Remove a product\n" +
                "5 - Find existing product\n" +
                "6 - Print menu list\n");
        System.out.println("Choose your action: ");


    }
}
*/
