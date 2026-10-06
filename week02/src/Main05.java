package main;

public class Main05 {  // main method: program starts here
    public static void main(String[] args) {  // Number to check
        int x;
        x = 11;  // If remainder is 0 after dividing by 2, the number is even
        if(x % 2 == 0){
            System.out.println("The number is even");
        }
        // Otherwise the number is odd
        else{
            System.out.println("The number is odd");
        }
    }
}
