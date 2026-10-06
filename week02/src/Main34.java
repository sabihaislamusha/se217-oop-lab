package main;

import java.util.Scanner;

public class Main34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object to read from keyboard
        System.out.print("Enter s1: "); // Ask for the first string
        String s1 = sc.nextLine(); // nextLine() reads the full line (spaces included)
        System.out.print("Enter s2: ");
        String s2 = sc.next(); // next() reads only one word (stops at space)

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        // Show both inputs
        sc.close(); // Close the Scanner when done
    }
}
