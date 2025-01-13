package com.javabasics;

import java.util.ArrayList;

// GroceryList class to manage the list
class GroceryList {
    private ArrayList<String> items;

    // Constructor to initialize the list
    public GroceryList() {
        items = new ArrayList<>();
    }

    // Method to add an item to the list
    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " has been added to the grocery list.");
    }

    // Method to remove an item from the list
    public void removeItem(String item) {
        if (items.remove(item)) {
            System.out.println(item + " has been removed from the grocery list.");
        } else {
            System.out.println(item + " was not found in the grocery list.");
        }
    }

    // Method to view all items in the list
    public void viewList() {
        if (items.isEmpty()) {
            System.out.println("The grocery list is empty.");
        } else {
            System.out.println("Grocery List:");
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + ". " + items.get(i));
            }
        }
    }
}
