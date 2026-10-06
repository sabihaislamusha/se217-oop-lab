package main;

public class Main08{
    public static void main(String[] args) {
        // Value used to choose a case
        int x;
        x = 5;

        // switch compares x with each case value
        switch (x) {
            case 1:
                System.out.println("Bangladesh");
                  break; // break stops the switch so the next case does not run
            case 2:
                System.out.println("USA");
                break;
            case 3:
                System.out.println("Canada");
                break;
            default:  // default runs when no case matches
                System.out.println("Out of the world");
        }
    }
}
