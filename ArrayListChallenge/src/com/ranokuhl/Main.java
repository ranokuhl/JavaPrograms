package com.ranokuhl;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("001 234 567 89");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
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
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phoneNumber);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: " + name + ", phone " + phoneNumber);
        } else {
            System.out.println("Cannot add " + name + " already on file.");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Record updated successfully.");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted record.");
        } else {
            System.out.println("Error deleting contact.");
        }
    }

    private static void findContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());

        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted record.");
        } else {
            System.out.println("Error deleting contact.");
        }
    }


    private static void startPhone() {
        System.out.println("Starting phone..");
    }

    private static void printActions() {
        System.out.println("Available actions: \npress");
        System.out.println("0 - Shutdown\n" +
                        "1 - Print contacts\n" +
                        "2 - Add a new contact\n" +
                        "3 - Update an existing contact\n" +
                        "4 - Remove a contact\n" +
                        "5 - Find existing contact\n" +
                        "6 - Print list of contacts\n");
        System.out.println("Choose your action: ");


    }
}
