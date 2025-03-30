package com.bridgelabz.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// Class to generate custom exception for InsufficientBalance
class InsufficientBalanceException extends Exception {
    // Constructor to call the exception
    InsufficientBalanceException(String message) {
        super(message);
    }
}

// Class to manage a bank account
class BankAccount {
    // Attributes
    private double balance;

    // Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }

    // method to withdraw balance
    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if(amount<0) {
            throw new IllegalArgumentException("Error: Invalid amount!");
        }
        if(amount>balance) {
            throw new InsufficientBalanceException("Error: Insufficient balance!");
        }
        balance-=amount;
        System.out.println("Withdrawal successful, updated balance: " + balance);
    }
}

// Class to manage bank system with exception handling
public class BankSystem {
    public static void main(String[] args) {
        // Use try-catch to handle exception
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Enter initial balance: ");
            double balance = input.nextDouble();

            BankAccount account = new BankAccount(balance);

            System.out.print("Enter withdrawal amount: ");
            double amount = input.nextDouble();

            account.withdraw(amount);
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric value.");
        }
    }
}
// Sample Output ->
// Enter initial balance: 1000
// Enter withdrawal amount: 500
// Withdrawal successful, updated balance: 500.0

// Enter initial balance: 1000
// Enter withdrawal amount: 1500
// Error: Insufficient balance!

// Enter initial balance: 1000
// Enter withdrawal amount: -500
// Error: Invalid amount!

// Enter initial balance: 1000
// Enter withdrawal amount: a
// Error: Please enter valid numeric value.