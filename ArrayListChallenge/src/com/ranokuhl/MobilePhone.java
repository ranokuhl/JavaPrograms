package com.ranokuhl;

import java.util.ArrayList;

public class MobilePhone {

    // Master class that holds ArrayList of Contacts

    private String myNumber;
    private ArrayList<Contacts> mobileContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.mobileContacts = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already filed.");
            return false;
        }

        mobileContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int findPosition = findContact(oldContact);
        if(findPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }

        this.mobileContacts.set(findPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contact) {
        int findPosition = findContact(contact);
        if(findPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.mobileContacts.remove(findPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    private int findContact(Contacts contact) {
        return this.mobileContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.mobileContacts.size(); i++) {
            Contacts contact = this.mobileContacts.get(i);
                if(contact.getName().equals(contactName)) {
                    return -i;
                }
        }
        return -1;
    }

    public String queryContact(Contacts contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return this.mobileContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact list");
        for (int i = 0; i < this.mobileContacts.size(); i++) {
            System.out.println((i+1) + "." +
                    this.mobileContacts.get(i).getName() + " -> " +
                    this.mobileContacts.get(i).getPhoneNumber());
        }
    }




}
