package com.bridgelabz.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// Class to check exceptions occur in array
public class ArrayExceptions {
    public static void main(String[] args) {
        // Use try-catch to handle exceptions
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Enter size of the array: ");
            int n = input.nextInt();
            Integer[] arr = new Integer[n];

            System.out.print("Enter elements of array: ");
            for(int i=0;i<n;i++) {
                arr[i] = input.nextInt();
            }

            System.out.print("Enter the index of the value to retrieve: ");
            int index = input.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid Index!");
        } catch (NullPointerException e) {
            System.out.println("Error: Array is not initialized");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric value.");
        }
    }
}
// Sample Output ->
// Enter size of the array: 3
// Enter elements of array: 1 2 3
// Enter the index of the value to retrieve: 4
// Error: Invalid Index!

// Enter size of the array: 3
// Enter elements of array: 1 2 3
// Enter the index of the value to retrieve: a
// Error: Please enter a valid numeric value.

// Enter size of the array: 3
// Enter elements of array: 1 2 3
// Enter the index of the value to retrieve: 2
// Value at index 2: 3