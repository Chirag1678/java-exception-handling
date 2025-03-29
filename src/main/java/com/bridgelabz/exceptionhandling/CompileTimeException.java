package com.bridgelabz.exceptionhandling;

import java.io.*;

// Class to display checked exception while reading a file
public class CompileTimeException {
    public static void main(String[] args) {
        // Create a File Object
        File file = new File("data.txt");

        // Use try-catch to handle exception
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line=br.readLine())!=null) {
                System.out.println(line);
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found.");
        } catch(IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
// Sample Output ->
//File not found.