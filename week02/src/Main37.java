package main;

import java.util.Scanner;

public class Main37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read from keyboard
        System.out.print("Enter the number: "); // Ask the user for a number
        int a = sc.nextInt(); // Read the number

        evenOdd(a);

        sc.close();
    }
    static void evenOdd(int x){
        if(x%2 == 0)
            System.out.println("The number is Even!");
        else
            System.out.println("The number is Odd!"); // Method receives x and checks if it is even or odd
    }
}
