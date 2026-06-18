
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class HospitalBillingSystem {
    public static void main(String[] args) {
        try {
            int bills = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Bill cannot be divided by zero.");
        }

        try {
            int[] patients = {1,2,3};
            System.out.println(patients[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            int amount = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }

        try {
            throw new InsufficientFundsException("Payment failed due to insufficient funds.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
