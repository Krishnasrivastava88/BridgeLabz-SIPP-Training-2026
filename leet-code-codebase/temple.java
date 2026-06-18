// A temple has N disks in the Tower of Hanoi puzzle. Solve it
// recursively and count moves. Also implement recursive: binary
// search on a sorted price list, sum of digits, reverse a string, and
// check balanced parentheses without a stack.
import java.util.*;

public class temple {

    // Tower of Hanoi
    static int moves = 0;

    static void hanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            moves++;
            return;
        }

        hanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        moves++;
        hanoi(n - 1, aux, to, from);
    }

    // Recursive Binary Search
    static int binarySearch(int arr[], int low, int high, int key) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == key)
            return mid;

        if (key < arr[mid])
            return binarySearch(arr, low, mid - 1, key);

        return binarySearch(arr, mid + 1, high, key);
    }

    // Sum of Digits
    static int sumDigits(int n) {
        if (n == 0)
            return 0;

        return n % 10 + sumDigits(n / 10);
    }

    // Reverse String
    static String reverse(String s) {
        if (s.length() == 0)
            return "";

        return reverse(s.substring(1)) + s.charAt(0);
    }

    // Balanced Parentheses without Stack
    static boolean balanced(String s, int count, int index) {
        if (count < 0)
            return false;

        if (index == s.length())
            return count == 0;

        if (s.charAt(index) == '(')
            return balanced(s, count + 1, index + 1);

        if (s.charAt(index) == ')')
            return balanced(s, count - 1, index + 1);

        return balanced(s, count, index + 1);
    }

    public static void main(String[] args) {

        // Tower of Hanoi
        int n = 3;
        hanoi(n, 'A', 'C', 'B');
        System.out.println("Total Moves = " + moves);

        // Binary Search
        int arr[] = {10, 20, 30, 40, 50, 60};
        System.out.println("Index = " +
                binarySearch(arr, 0, arr.length - 1, 40));

        // Sum of Digits
        System.out.println("Sum of Digits = " +
                sumDigits(12345));

        // Reverse String
        System.out.println("Reverse = " +
                reverse("Krishna"));

        // Balanced Parentheses
        String str = "(()())";
        System.out.println("Balanced = " +
                balanced(str, 0, 0));
    }
}