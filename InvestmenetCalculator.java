/*
 Investment Calculator:
Create a Java program that calculates the future value of an investment. The user 
should input the initial investment, interest rate, and time period, and the program
should display the future value.
 
 */


package javaproject1;

import java.util.Scanner;

public class InvestmenetCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Future Value Calculator");
        System.out.print("Enter the initial investment: ");
        double initialInvestment = scanner.nextDouble();//Taking initial investment from user.
        System.out.print("Enter the annual interest rate (as a decimal): ");
        double interestRate = scanner.nextDouble();//Taking Interest from user.
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();//Taking number of years from user.
        double futureValue = calculateFutureValue(initialInvestment, interestRate, years);
        System.out.println("The future value of your investment after " + years + " years will be: " + futureValue);
        scanner.close();
    }
    public static double calculateFutureValue(double initialInvestment, double interestRate, int years) {
        // Formula to calculate future value: FV = P(1 + r)^t
        double futureValue = initialInvestment * Math.pow(1 + interestRate, years);
        return futureValue;
    }
}