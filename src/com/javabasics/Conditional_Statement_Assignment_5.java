package com.javabasics;

public class Conditional_Statement_Assignment_5 {

    public static void main(String[] args) {
        String customerName = "John Doe";
        int creditScore = 720;
        double income = 55000.0;
        boolean isEmployed = true;
        double debtToIncomeRatio = 35.0;

        // Evaluate the loan criteria
        if (creditScore > 750) {
            System.out.println("Loan Approved: Excellent credit score.");
        } else if (creditScore >= 650 && creditScore <= 750) {
            if (income >= 50000) {
                if (isEmployed) {
                    if (debtToIncomeRatio < 40) {
                        System.out.println("Loan Approved: Meets all criteria.");
                    } else {
                        System.out.println("Loan Rejected: High Debt-to-Income Ratio.");
                    }
                } else {
                    System.out.println("Loan Rejected: Employment status not verified.");
                }
            } else {
                System.out.println("Loan Rejected: Insufficient income.");
            }
        } else {
            System.out.println("Loan Rejected: Low credit score.");
        }
    }
}

