package main;

public class Main12 {
    public static void main(String[] args) {
        for(int i = 1; i <=10; i++){ // Loop from 1 to 10

            if(i % 2 == 0)
                continue;  // continue skips the rest of this round for even numbers
             // Only odd numbers reach here: 1, 3, 5, 7, 9
            System.out.println(i);
        }
    }
}
