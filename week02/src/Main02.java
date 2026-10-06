package main;

public class Main02 { // main method: program starts here
    public static void main(String[] args) {  // Declare variables of different data types
        int x;
        float y;
        char z;
        Boolean a; 
        x = 300; // Assign values to the variables
        y = (float)2.77; // (float) converts the double value 3.88 into float
        z = 'S';  // char uses single quote
        a = true;

        // Print each value; + joins the text with the variable
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The name of z is: " + z);
        System.out.println("The name of a is: " + a);
    }
}
