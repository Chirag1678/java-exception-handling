package com.bridgelabz.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Class to check file exception by using try-with-resources
public class AutoClosingResources {
    public static void main(String[] args) {
        // Create a file object
        File file = new File("sample.txt");

        // Using try-with-resources
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String firstLine = br.readLine();
            if(firstLine!=null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
// Sample Output ->
// Error reading file.