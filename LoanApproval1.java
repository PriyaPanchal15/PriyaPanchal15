/*Loan Approval:
You are developing a loan approval system. Write a Java program that takes a 
user's credit score, income, and loan amount as input and determines whether the 
loan should be approved or denied based on predefined criter
*/

package javaproject1;

import java.util.Scanner;

public class LoanApproval1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Loan Approval System");
        System.out.print("Enter your credit score (300-850): ");
        //Taking credit score from user
        int creditScore = scanner.nextInt();

        System.out.print("Enter your annual income: ");
        //Taking annual income from user
        double income = scanner.nextDouble();

        System.out.print("Enter the loan amount: ");
        //Taking loan amount from user.
        double loanAmount = scanner.nextDouble();

        boolean isLoanApproved = checkLoanApproval(creditScore, income, loanAmount);

        if (isLoanApproved) {
            System.out.println("Congratulations! Your loan is approved.");
        } else {
            System.out.println("Sorry, your loan application is denied.");
        }

        scanner.close();
    }

    public static boolean checkLoanApproval(int creditScore, double income, double loanAmount) {
        if (creditScore >= 700 && income >= 30000 && loanAmount <= 100000) {
            return true;
        } else if (creditScore >= 650 && income >= 25000 && loanAmount <= 75000) {
            return true;
        } else {
            return false;
        }
    }
}