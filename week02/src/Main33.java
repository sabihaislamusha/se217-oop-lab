package main;

import java.util.Scanner;

public class Main33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read from keyboard
        
        int x;  // Variable to store the input
        System.out.print("Enter the value of x: "); // Ask the user for a value
        x = sc.nextInt(); // nextInt() reads an integer
        System.out.println("x = " + x); // Show the entered value

        sc.close(); // Close the Scanner when done
    }
}
