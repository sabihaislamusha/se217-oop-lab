package main;

public class Main38 {
    public static void main(String[] args) {
        divisors(10); // Call the method with the number 10
    }
    static void divisors(int num){ // Method receives num and prints its divisors
        for(int i = 1; i <= num; i++){ // Check every number from 1 to num
            if(num % i == 0) // If num divides evenly by i, then i is a divisor
                System.out.println(i);
        }
    }
}
