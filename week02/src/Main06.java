package main;

public class Main06 {  // main method: program starts here
    public static void main(String[] args) { // Character to check
        char ch;
        ch = 'a';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel"); // If the character is any of a, e, i, o, u, it is a vowel
        } 
        else{
            System.out.println("Consonant");  // Anything else is a consonant
        }
    }
}
