package main;

public class Main02 { // main method: program starts here
    public static void main(String[] args) {  // Declare variables of different data types
        int x;
        float y;
        char z;
        Boolean a; // Assign values to the variables
        x = 500; // (float) converts the double value 3.88 into float
        y = (float)3.88;  // char uses single quotes
        z = 'S';
        a = true;

        // Print each value; + joins the text with the variable
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The name of z is: " + z);
        System.out.println("The name of a is: " + a);
    }
}
