package main;

public class Main23 {
    public static void main(String[] args) {
        int[] x = {11, 34, 55, -67, 57}; // Array has 5 elements (index 0 to 4)
        
        for(int i = 0; i <= x.length; i++){ // Note: <= goes one step too far (i becomes 5) and causes ArrayIndexOutOfBoundsException. Use i < x.length instead
            System.out.println(x[i]); // Print the element at index i
        }
    }
}
