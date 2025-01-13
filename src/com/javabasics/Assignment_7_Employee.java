package com.javabasics;

import java.util.HashMap;
import java.util.Map;

public class Assignment_7_Employee {

	    public static void main(String[] args) {
	        // Employee data arrays
	        String[] names = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
	        double[] baseSalaries = {75000, 68000, 82000, 90000, 60000};
	        int[] experiences = {5, 3, 7, 10, 2};
	        double[] ratings = {4.2, 3.8, 4.5, 2, 3.5};

	        // Map to store the hike percentage
	        Map<String, Double> hikePercentageMap = new HashMap<>();

	        for (int i = 0; i < names.length; i++) {
	            double baseSalary = baseSalaries[i];
	            int experience = experiences[i];
	            double rating = ratings[i];

	            // Determine variable pay percentage and bonus
	            double variablePayPercentage;
	            double bonus;
	            if (rating >= 4) {
	                variablePayPercentage = 15;
	                bonus = 1500;
	            } else if (rating >= 3) {
	                variablePayPercentage = 10;
	                bonus = 1200;
	            } else {
	                variablePayPercentage = 3;
	                bonus = 300;
	            }

	            // Determine extra reward based on experience
	            double reward = (experience >= 5) ? 5000 : 0;

	            // Calculate the hike
	            double hike = (baseSalary * variablePayPercentage / 100) + bonus + reward;

	            // Calculate hike percentage
	            double hikePercentage = (hike / baseSalary) * 100;

	            // Store in map
	            hikePercentageMap.put(names[i], hikePercentage);
	        }

	        // Print the hike percentage for each employee
	        System.out.println("Employee Hike Percentages:");
	        for (Map.Entry<String, Double> entry : hikePercentageMap.entrySet()) {
	            System.out.printf("%s: %.2f%%\n", entry.getKey(), entry.getValue());
	        }
	    }
	}


