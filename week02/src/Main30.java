package main;

public class Main30 {
    public static void main(String[] args) {
        String s = "I@love@Bangladesh"; // Words are separated by @

        String[] a = s.split("@"); // split("@") cuts the string at every @ and returns an array

        for(int i = 0; i < a.length; i++){ // Print each part one by one
            System.out.println(a[i]);
        }
    }
}
