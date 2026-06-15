import java.util.*;

public class WordMatchSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.println("\nUppercase Strings:");
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toUpperCase());

        System.out.println("\nLength of first string: " + s1.length());
        System.out.println("Length of second string: " + s2.length());

        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("\nThe strings are Anagrams.");
        } else {
            System.out.println("\nThe strings are Not Anagrams.");
        }
    }
}