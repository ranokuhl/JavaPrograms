package com.ranokuhl;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void updateGroceryList(String currentItem, String newItem) {
        int position = findGroceryItem(newItem);
        if(position >= 0) {
            updateGroceryList(position, newItem);
        }
    }

    private void updateGroceryList(int position, String updateItem) {
        groceryList.set(position, updateItem);
        System.out.println("Grocery item " + (position+1) + " has been updated.");
    }

    public void removeGroceryItem(String item) {
        int position = findGroceryItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findGroceryItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findGroceryItem(searchItem);
        if(position >= 0) {
            return true;
        }
        return false;
    }


}
