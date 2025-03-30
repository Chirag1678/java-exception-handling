package com.bridgelabz.exceptionhandling;

// Class to handle exception through propagation
public class ExceptionPropagation {
    public static void main(String[] args) {
        // Use try-catch to handle exceptions
        try{
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main.");
        }
    }

    // method to throw exception
    public static void method1() {
        int result = 10 / 0; // This will throw ArithmeticException
    }

    // method to call method1()
    public static void method2() {
        method1();
    }
}
// Sample Output ->
// Handled exception in main.