package main;

public class Main17 {
    public static void main(String[] args) {
        int x = -30; // Starting value
        do{ // Body runs once even if the condition is false
            System.out.println("Hi");
            x++;
        } while(x >= -25); // After x++ , x = -29, so the condition is false and the loop stops
    }
}
