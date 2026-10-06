package main;

public class Main15 {
    public static void main(String[] args) {
        int i = 5, sum = 0; // i starts at 5, sum starts at 0

        while(i <= 100){  // Repeat until i goes past 100
            sum += i; // Add the current number to sum
            i+=5; // Jump to the next multiple of 5
        }
        System.out.println("The sum is: " + sum); // Print the total (5 + 10 + ... + 100)
    }
}
