// A spy agency encodes messages. Reverse a secret message, check if
// it is a palindrome, count vowels/consonants, and verify if two
// intercepts are anagrams. Extend: find the first non-repeating
// character in a surveillance log.
import java.util.*;

public class SpyAgency {

    static String reverse(String s) {
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        return rev;
    }

    static boolean isPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        return rev.equals(s);
    }

    static void countVC(String s) {w

        int v = 0;
        int c = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    v++;
                } else {
                    c++;
                }
            }
        }

        System.out.println("Vowels = " + v);
        System.out.println("Consonants = " + c);
    }

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        int[] f = new int[256];

        for (int i = 0; i < a.length(); i++) {
            f[a.charAt(i)]++;
            f[b.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (f[i] != 0) {
                return false;
            }
        }

        return true;
    }

    static char firstNonRepeating(String s) {

        int[] f = new int[256];

        for (int i = 0; i < s.length(); i++) {
            f[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (f[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }

        return '#';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Secret Message: ");
        String msg = sc.nextLine();

        System.out.println("Reversed = " + reverse(msg));

        if (isPalindrome(msg))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        countVC(msg);

        System.out.print("Intercept 1: ");
        String s1 = sc.next();

        System.out.print("Intercept 2: ");
        String s2 = sc.next();

        if (isAnagram(s1, s2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        char ch = firstNonRepeating(msg);

        if (ch == '#')
            System.out.println("No Non-Repeating Character");
        else
            System.out.println("First Non-Repeating Character = " + ch);
    }
}