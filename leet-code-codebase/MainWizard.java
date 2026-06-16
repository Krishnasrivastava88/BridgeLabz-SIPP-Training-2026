// Build a 'Math Wizard' utility class: isPrime(n), factorial(n) using
// iteration, fibonacci(n), gcd(a,b), lcm(a,b), and power(base, exp).
// Overload factorial to also accept double. Demonstrate scope
// differences between local and instance variables.
public class MainWizard {

    int instanceVar = 100; // Instance Variable

    public static void main(String[] args) {

        MainWizard obj = new MainWizard();

        System.out.println("Prime: " + isPrime(17, 2));
        System.out.println("Factorial(int): " + factorial(5));
        System.out.println("Factorial(double): " + factorial(5.0));
        System.out.println("Fibonacci: " + fibonacci(10));
        System.out.println("GCD: " + gcd(12, 8));
        System.out.println("LCM: " + lcm(12, 8));
        System.out.println("Power: " + power(2, 3));

        obj.showScope();
    }

    public static boolean isPrime(int n, int a) {

        if (n <= 1) return false;

        if (a * a > n) return true;

        if (n % a == 0) return false;

        return isPrime(n, a + 1);
    }

    public static long factorial(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static double factorial(double n) {

        double fact = 1;

        for (int i = 1; i <= (int)n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static int fibonacci(int n) {

        if (n <= 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int gcd(int a, int b) {

        if (b == 0) return a;

        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {

        return (a * b) / gcd(a, b);
    }

    public static int power(int base, int exp) {

        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    public void showScope() {

        int localVar = 50; // Local Variable

        System.out.println("Instance Variable = " + instanceVar);
        System.out.println("Local Variable = " + localVar);
    }
}

