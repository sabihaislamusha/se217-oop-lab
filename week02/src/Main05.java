package main;

public class Main05 {  // main method: program starts here
    public static void main(String[] args) { 
        int x;  // Number to check
        x = 11; 
        if(x % 2 == 0){  // If remainder is 0 after dividing by 2, the number is eve
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");  // Otherwise the number is odd
        }
    }
}
