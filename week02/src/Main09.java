package main;

public class Main09 {  // main method: program starts here
    public static void main(String[] args) {
        int x = 5;  // Starting value

        
        System.out.println(x++);  // Post-increment: prints 5 first, then x becomes 6
        System.out.println(++x);  // Pre-increment: x becomes 7 first, then prints 7

        
        x = 5; // Reset x to 5

       
        System.out.println(x--);  // Post-decrement: prints 5 first, then x becomes 4
       
        System.out.println(--x);  // Pre-decrement: x becomes 3 first, then prints 3

        int s = 10 + 2 * 4 - 3;
        System.out.println(s);
    }
}
