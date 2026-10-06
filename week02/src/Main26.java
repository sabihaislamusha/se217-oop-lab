package main;

public class Main26 {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30} , {40,50,60}}; // 2D array with 2 rows and 3 columns

        for(int i = 0; i < 2; i++){ // Outer loop goes through the rows
            for(int j = 0; j < 3; j++){  // Inner loop goes through the columns
                System.out.print(arr[i][j] + " "); 
            }
            System.out.println(); // New line after each row
        }
    }
}
