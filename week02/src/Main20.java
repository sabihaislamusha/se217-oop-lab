package main;

public class Main20 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){ // Outer loop: rows 1 to 5
            for(int j = 1; j <= i; j++){ // Inner loop: row number i prints i stars
                System.out.print("*");
            }
            System.out.println();  // New line after each row
        }
    }
}
