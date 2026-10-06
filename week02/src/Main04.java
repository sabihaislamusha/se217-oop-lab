package main;

public class Main04 { // main method: program starts here
    public static void main(String[] args) { 
        int x = 12;  // Number to check
        if(x % 2 == 0 && x % 5 == 0){  // && means BOTH conditions must be true (divisible by 2 and 5)
            System.out.println("Hi");
        }  
        else if(x % 2 == 0 || x % 5 == 0){ // || means at least ONE condition must be true (divisible by 2 or 5)
            System.out.println("Hlw");
        }  // Runs when none of the above conditions is true
        else{
            System.out.println("Fail");
        }
    }
}
