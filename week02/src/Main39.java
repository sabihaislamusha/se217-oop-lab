package main;

import java.util.Scanner;

public class Main39 {
    public static void main(String[] args) {
        int x,y; // Declares two integer variables: x and y
        System.out.println("Please enter the value of x and y: "); // Asks the user to enter the values of x and y
        Scanner sc = new Scanner(System.in); // Creates a Scanner object to read input from the keyboard
        x = sc.nextInt(); // Reads the first integer entered by the user and stores it in x
        y = sc.nextInt(); // Reads the second integer entered by the user and stores it in y
        sc.close(); // Closes the Scanner after taking the input

        int r = add(x,y); // Calls the add() method and stores the returned result in r
        System.out.println("Output: " + r);
    }
static int add(int x, inty){
    int result = x + y; // Adds x and y and stores the result in the result variable
     return result;
}
    static int substract(int x, int y){
        int result = x-y; // Subtracts y from x and stores the result
        return result;
    }
    static int multiply(int x. int y){
        int result = x * y; // Multiplies x and y and stores the result
        return result;
    }
    static int divide(int x. int y){
        int result = x / y; // Divides x by y and stores the result
        return result;
    }
}
