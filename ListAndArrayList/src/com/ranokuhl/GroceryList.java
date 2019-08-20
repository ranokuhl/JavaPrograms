package com.ranokuhl;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {

        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }

    }

    public void updateGroceryList(int position, String updateItem) {
        groceryList.set(position, updateItem);

        System.out.println("Grocery item " + (position+1) + " has been updated.");
    }

    public void removeGroceryItemt(int position) {
        String getItemPosition = groceryList.get(position);

        groceryList.remove(position);
    }

    public String findGroceryItem(String searchItem) {
        int position = groceryList.indexOf(searchItem);

        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
