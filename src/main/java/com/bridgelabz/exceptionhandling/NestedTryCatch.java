package com.bridgelabz.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// Class to handle exceptions using nested try-catch
public class NestedTryCatch {
    public static void main(String[] args) {
        // Create a Scanner Object
        try(Scanner input = new Scanner(System.in)) {
            // Take user inputs
            System.out.print("Enter size of the array: ");
            int n = input.nextInt();
            int[] arr = new int[n];

            System.out.print("Enter elements of array: ");
            for(int i=0;i<n;i++) {
                arr[i] = input.nextInt();
            }

            System.out.print("Enter index to access: ");
            int index = input.nextInt();

            try {
                int value = arr[index];

                System.out.print("Enter the divisor: ");
                int divisor = input.nextInt();

                try {
                    int res = value / divisor;

                    System.out.printf("Result of %d / %d: %d\n", value, divisor, res);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Cannot divide by zero.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid array index!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Enter valid numeric value.");
        }
    }
}
// Sample Output ->
// Enter size of the array: 3
// Enter elements of array: 1 2 3
// Enter index to access: 4
// Error: Invalid array index!

// Enter size of the array: 3
// Enter elements of array: 1 2 3
// Enter index to access: a
// Error: Enter valid numeric value.

// Enter size of the array: 3
// Enter elements of array: 1 2 3
// Enter index to access: 2
// Enter the divisor: 0
// Error: Cannot divide by zero.

// Enter size of the array: 3
// Enter elements of array: 1 2 3
// Enter index to access: 2
// Enter the divisor: 2
// Result of 3 / 2: 1