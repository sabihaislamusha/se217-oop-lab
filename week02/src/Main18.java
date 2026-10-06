package main;

public class Main18 {
    public static void main(String[] args) {
        int i, j; // i for the outer loop, j for the inner loop
        for(i = 0; i <= 2; i++){ // Outer loop runs 3 times
            System.out.println("Outer loop start:");

            for(j = 0; j <= 3; j++){ // Inner loop runs 4 times for each outer round
                System.out.println("Hi");

            }
            System.out.println("Outer loop end"); // Printed after the inner loop finishes
        }
    }
}
