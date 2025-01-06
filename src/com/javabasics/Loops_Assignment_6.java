package com.javabasics;

public class Loops_Assignment_6 {
	



	    public static void main(String[] args) {
	        // Transactions stored in an array
	        int[] transactions = {50000, -2000, 3000, -15000, -200, -300, 4000, -3000};

	        int totalCreditCount = 0;
	        int totalDebitCount = 0;
	        int totalCreditedAmount = 0;
	        int totalDebitedAmount = 0;
	        int suspiciousTransactionCount = 0;

	        // Iterate through the transactions
	        for (int i = 0; i < transactions.length; i++) {
	            int transaction = transactions[i];

	            // Check if transaction is credit or debit
	            if (transaction > 0) {
	                totalCreditCount++;
	                totalCreditedAmount += transaction;
	            } else {
	                totalDebitCount++;
	                totalDebitedAmount += transaction; // Debit amounts are negative
	            }

	            // Check for suspicious transactions
	            if (transaction > 10000 || transaction < -10000) {
	                System.out.println("Suspicious transaction with Amount: " + transaction);
	                suspiciousTransactionCount++;
	            }
	        }

	        // Calculate remaining balance
	        int remainingBalance = totalCreditedAmount + totalDebitedAmount;

	        // Print results
	        System.out.println("Total Credit Transactions: " + totalCreditCount);
	        System.out.println("Total Debit Transactions: " + totalDebitCount);
	        System.out.println("Total Amount Credited: " + totalCreditedAmount);
	        System.out.println("Total Amount Debited: " + (-totalDebitedAmount)); // Make debited amount positive for display
	        System.out.println("Remaining Balance: " + remainingBalance);
	        System.out.println("Total Suspicious Transactions: " + suspiciousTransactionCount);
	    }
	


}
