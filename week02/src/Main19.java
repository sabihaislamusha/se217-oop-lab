package main;

public class Main19 {
    public static void main(String[] args) {
        int i, j;  // i = rows, j = columns
        for(i = 0; i <= 2; i++){ // Outer loop: each round is one row
            for(j = 0; j <= 3; j++){ // Inner loop: prints 4 stars in a row
                System.out.print("*");

            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
