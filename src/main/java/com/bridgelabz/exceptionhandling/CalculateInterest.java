package com.bridgelabz.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// Class to calculate interest and check for exceptions if occur
public class CalculateInterest {
    public static void main(String[] args) {
        // Use try-catch to handle exceptions
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Enter amount: ");
            double amount = input.nextDouble();

            System.out.print("Enter rate: ");
            double rate = input.nextDouble();

            System.out.print("Enter years: ");
            int years = input.nextInt();

            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculate Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        }
    }

    // method to calculate interest
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if(amount<0 || rate<0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive.");
        }
        return (amount * rate * years) / 100;
    }
}
// Sample Output ->
// Enter amount: 1000
// Enter rate: 5
// Enter years: 2
// Calculate Interest: 100.0

// Enter amount: -1000
// Enter rate: 5
// Enter years: 2
// Invalid input: Amount and rate must be positive.

// Enter amount: 1000
// Enter rate: 5
// Enter years: a
// Error: Please enter valid numeric values.