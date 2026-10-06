package main;

public class Main03 {  // main method: program starts here
    public static void main(String[] args) { 
    int a, b, c;  // Three numbers whose average we want
    a = 15;
    b = 22;
    c = 37;
     // float, so the result can have a decimal part
    
    float avg; // (float) casting avoids integer division; sum divided by 3
    avg = (float)(a+b+c)/3;  // Show the average
    System.out.println("The averaage is: " + avg);
    }
}
