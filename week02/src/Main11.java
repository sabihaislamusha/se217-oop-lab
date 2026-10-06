package main;

public class Main11 {
    public static void main(String[] args) {
        for(int i = 1; i <=10; i++){ // Loop from 1 to 10
            System.out.println(i);

            if(i == 5){  // When i is 5, break exits the loop completely (prints 1 to 5)
                break;
            }
        }
    }
}
