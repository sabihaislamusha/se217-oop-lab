package main;

public class Main35 {
    public static void main(String[] args) {
        System.out.println("Program start: ");
        sayHi(); // Calling a method that does not return anything

        System.out.println("Sum is: " + getSum(10,20)); // Calling a method that returns a value (30)
    }
    static int getSum (int x, int y){
        int sum = x + y; // Method with 2 parameters; returns the sum as int
        return sum; // Send the result back to the caller
    }

    static void sayHi(){ // void means this method returns nothing
        System.out.println("Hi");
    }
}
