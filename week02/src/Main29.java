package main;

public class Main29 {
    public static void main(String[] args) {
        String s = "Dhaka, Bangladesh"; // String used for the methods below
        
        System.out.println(s.length()); // length() gives the number of characters
        System.out.println(s.toUpperCase()); // Convert all letters to capital
        System.out.println(s.toLowerCase()); // Convert all letters to small
        System.out.println(s.charAt(0)); // Get the character at index 0

        String s1 = "Dhaka";
        String s2 = "dhaka";
        // Two strings that differ only in letter case
        if(s1.equals(s2)){
            System.err.println("Equal"); // equals() is case sensitive, so Dhaka and dhaka are different
        }
        else{
            System.out.println("Not equal"); 
        }

        if(s1.equalsIgnoreCase(s2)){ // equalsIgnoreCase() ignores capital/small letters
            System.err.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
