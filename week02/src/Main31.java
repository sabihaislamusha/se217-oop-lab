package main;

public class Main31 {
    public static void main(String[] args) {
        String s = "I love Bangladesh"; // Words are separated by a single space

        String[] a = s.split(" ");   //both use for space
        String[] b = s.split("\\s"); 
        // Both " " and "\\s" split by space

        for(int i = 0; i < a.length; i++){ // Print the parts of array a
            System.out.println(a[i]);
        }
        System.out.println(); // Blank line between the two outputs
        for(int i = 0; i < b.length; i++){ // Print the parts of array b
            System.out.println(b[i]);
        }
    }
}
