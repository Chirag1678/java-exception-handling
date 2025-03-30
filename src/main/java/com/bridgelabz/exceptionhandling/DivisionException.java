package com.bridgelabz.exceptionhandling;

import java.util.Scanner;

// Class to perform integer division and check if exception occur, but always print through finally block
public class DivisionException {
    public static void main(String[] args) {
        // Use try-catch to handle exceptions
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } finally {
            System.out.println("Operation completed");
        }
    }
}
// Sample Output ->
// Enter first number: 10
// Enter second number: 0
// Error: Division by zero is not allowed.
// Operation completed

// Enter first number: 10
// Enter second number: a
// Error: Please enter valid numeric values.
// Operation completed

// Enter first number: 10
// Enter second number: 2
// Result: 5
// Operation completed