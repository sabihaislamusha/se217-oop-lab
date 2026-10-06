package main;

public class Main27 {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30} , {40,50,60}}; // 2D array with 2 rows and 3 columns
        int sum = 0; // sum stores the total of all values

        for(int i = 0; i < 2; i++){ // Go through every row
            for(int j = 0; j < 3; j++){ // Go through every column
                sum += arr[i][j]; // Add each element to sum
            } 
        }
        System.out.println("The avarage is: " + sum/6); // 6 elements in total (2 x 3); int division drops the decimal part
    }
}
