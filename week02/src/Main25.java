package main;

public class Main25 {
    public static void main(String[] args) {
        
        int[][] arr = new int[2][3];  // 2 rows and 3 columns; all values start as 0
        arr[1][0] = 10; // arr[row][column]: set values in row 1
        arr[1][1] = 20;

        int y = arr[1][0] + arr[1][1]; // Add the two values (10 + 20 = 30)
        System.out.println(y);  // Print the result

    }
}
