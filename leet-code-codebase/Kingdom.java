// A kingdom's tax system charges 5% for income <10K, 15% for 10K–
// 50K, 30% above 50K. Read a citizen's income, print tax bracket and
// amount. Extend: loop over an array of 10 citizens and tally total tax
// collected.
import java.util.Scanner;

public class Kingdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] income = new double[10];
        double totalTax = 0;

        for (int i = 0; i < 10; i++) {
            income[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            double tax;

            if (income[i] < 10000) {
                tax = income[i] * 0.05;
                System.out.println("5% Bracket, Tax = " + tax);
            } else if (income[i] <= 50000) {
                tax = income[i] * 0.15;
                System.out.println("15% Bracket, Tax = " + tax);
            } else {
                tax = income[i] * 0.30;
                System.out.println("30% Bracket, Tax = " + tax);
            }

            totalTax += tax;
        }

        System.out.println("Total Tax Collected = " + totalTax);
    }
}
