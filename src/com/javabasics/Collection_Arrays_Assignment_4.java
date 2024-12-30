package com.javabasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection_Arrays_Assignment_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To create list of top populated countries and print second 2nd country
		//List of top populated countries
		List <String> topPopulatedCountries = new ArrayList<String>();
		topPopulatedCountries.add("India");
		topPopulatedCountries.add("China");
		topPopulatedCountries.add("USA");
		topPopulatedCountries.add("Brazil");
		topPopulatedCountries.add("Nigeria");
		
		//To print all the countries
		System.out.println(topPopulatedCountries);
		//To print all 2nd largest populated country
		System.out.println("Second largest populated country : " + topPopulatedCountries.get(0));
		
		
		
		// Create a set of the top 10 most visited tourist attractions
        Set <String> attractions = new HashSet<>();
        attractions.add("Eiffel Tower");
        attractions.add("Great Wall of China");
        attractions.add("Taj Mahal");
        attractions.add("Grand Canyon");
        attractions.add("Machu Picchu");
        attractions.add("Statue of Liberty");
        attractions.add("Colosseum");
        attractions.add("Disney World");
        attractions.add("Louvre Museum");
        attractions.add("Times Square");
        
        //Print the Set
        System.out.println("All the tourist attraction:" + attractions);
        

        // Print the size of the set
        System.out.println("Number of tourist attractions: " + attractions.size());
        
        //Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
        
        int [] randomIntegers = new int [] {1, 2, 3, 4, 5,6,7,8,9,10};
        int Sum = randomIntegers[2] + randomIntegers[4];
        
        //Sum of 3rd and 5th value
        System.out.println("Sum of integers:" + Sum);
        
        
        //Create a map of the 5 largest cities in the United States and their populations.
        //Population is counted in millions
        Map<String,Double> largestCities = new HashMap<>();
        largestCities.put("New York City", 8.5);
        largestCities.put("Los angeles", 3.9);
        largestCities.put("Chicago",2.7);
        largestCities.put("Illionis",2.3);
        largestCities.put("Housten",1.7);
        
        //Print out the largest cities in the United states and their populations
        System.out.println(largestCities);
        
        
        
    
        // Create a list of the top 5 highest-grossing movies
        List<String> movies = new ArrayList<>();
        movies.add("Avatar");
        movies.add("Avengers: Endgame");
        movies.add("Titanic");
        movies.add("Star Wars: The Force Awakens");
        movies.add("Avengers: Infinity War");

        // Print out the third movie on the list 
        System.out.println("The third highest-grossing movie is: " + movies.get(2));
        
        
        
        

	}

}
