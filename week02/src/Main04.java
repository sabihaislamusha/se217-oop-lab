package main;

public class Main04 { // main method: program starts here
    public static void main(String[] args) {  // Number to check
        int x = 22;  // && means BOTH conditions must be true (divisible by 2 and 5)
        if(x % 2 == 0 && x % 5 == 0){
            System.out.println("Hi");
        }  // || means at least ONE condition must be true (divisible by 2 or 5)
        else if(x % 2 == 0 || x % 5 == 0){
            System.out.println("Hlw");
        }  // Runs when none of the above conditions is true
        else{
            System.out.println("Fail");
        }
    }
}
