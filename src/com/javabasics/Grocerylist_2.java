package com.javabasics;

public class Grocerylist_2 {

	    public static void main(String[] args) {
	        GroceryList groceryList = new GroceryList();

	   
	        groceryList.addItem("Apples");
	        groceryList.addItem("Bananas");
	        groceryList.addItem("Carrots");

	        // View list after adding items
	        groceryList.viewList();

	        // Remove an item
	        groceryList.removeItem("Bananas");

	        // View list after removal
	        groceryList.viewList();

	        // Attempt to remove an item not in the list
	        groceryList.removeItem("Potatoes");

	        // Final view of the list
	        groceryList.viewList();
	    }
	}


