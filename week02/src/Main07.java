package main;

public class Main07 {  // main method: program starts here
    public static void main(String[] args) {
        int age;  // Age to check
        age = 20;

        // Conditions are checked from top to bottom; the first true one runs
        if(age < 2){
            System.out.println("Infant");
        }else if(age < 10){
            System.out.println("Child");
        }else if(age < 20){
            System.out.println("Teenage");
        }else if(age < 30){
            System.out.println("Adult");
        }else{
            System.out.println("Old");
        }
    }
}
