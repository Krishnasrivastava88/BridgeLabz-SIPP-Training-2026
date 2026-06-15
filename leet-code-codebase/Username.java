// 1. Username Validator 
// A company wants to validate usernames entered by users.
// Write a program that:
// Accepts a username.
// Checks whether it contains any spaces.
// Counts the total number of characters.
// Converts the username to uppercase.
// Displays whether the username is a palindrome.
import java.util.*;

public class Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        System.out.println("Username: " + a);

        if (a.contains(" ")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        String rev = "";

for(int i = a.length() - 1; i >= 0; i--) {
    rev += a.charAt(i);
}

if(a.equalsIgnoreCase(rev)) {
    System.out.println("Palindrome");
} else {
    System.out.println("Not Palindrome");
}

        int count = a.length();
        System.out.println("Total characters: " + count);

        String upper = a.toUpperCase();
        System.out.println("Uppercase: " + upper);
    }
}