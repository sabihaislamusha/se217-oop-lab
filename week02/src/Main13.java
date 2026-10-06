package main;

public class Main13 {
    public static void main(String[] args) {
        int sum = 0; // sum stores the total, starting from 0
        for(int i = 30; i <= 120; i++){  // Check every number from 30 to 120
            if(i % 3 == 0 && i % 5 == 0){  // Add only numbers divisible by both 3 and 5
                sum += i;
            }
        }
        System.out.println("The sum is: " + sum);  // Print the final sum
    }
}
