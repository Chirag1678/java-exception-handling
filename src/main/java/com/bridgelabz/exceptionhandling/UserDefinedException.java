package com.bridgelabz.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// Class for custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Class to implement custom exceptions and handle them
public class UserDefinedException {
    public static void main(String[] args) {
        // Use try-catch to handle exceptions
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int n = input.nextInt();
            validateAge(n);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric age.");
        }
    }

    // method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if(age<18) {
            throw new InvalidAgeException("InvalidAgeException: Age must be 18 or above.");
        } else {
            System.out.println("Access granted!");
        }
    }
}
// Sample Output ->
// Enter your age: 15
// InvalidAgeException: Age must be 18 or above.

// Enter your age: a
// Error: Please enter valid numeric age.

// Enter your age: 20
// Access granted!