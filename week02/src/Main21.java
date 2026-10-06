package main;

public class Main21 {
    public static void main(String[] args) {
        int[] a = new int[5]; // Create an array that can hold 5 integers
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
// Store values by index (index starts from 0)
        int x = a[0] + a[2]; // Add the values at index 0 and 2 (10 + 30 = 40)
        System.out.println("Value of X: " + x);

        a[2] = 100; // Change the value at index 2 to 100
        x = a[0] + a[2]; // Add again with the new value (10 + 100 = 110)
        System.out.println("Value of X: " + x);
    }
}
