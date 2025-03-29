package com.bridgelabz.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// Class to check for runtime exceptions like ArithmeticException and InputMismatchException
public class RunTimeException {
    public static void main(String[] args) {
        // Create a Scanner Object
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int n1 = input.nextInt();

            System.out.print("Enter second number: ");
            int n2 = input.nextInt();

            int res = n1 / n2;
            System.out.printf("Result of %d / %d: %d\n", n1, n2, res);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        }
    }
}
// Sample Output ->
// Enter first number: 10
// Enter second number: 0
// Error: Division by zero is not allowed.

// Enter first number: 10
// Enter second number: a
// Error: Please enter valid numeric values.

// Enter first number: 10
// Enter second number: 2
// Result of 10 / 2: 5