
public class PasswordStrengthChecker {

    static void checkPassword(String password) {
        try {
            if(password == null)
                throw new NullPointerException("Password is null");

            if(password.isEmpty())
                throw new Exception("Password cannot be empty");

            if(password.length() < 8)
                throw new Exception("Password must be at least 8 characters");

            if(!Character.isUpperCase(password.charAt(0)))
                throw new Exception("First character must be uppercase");

            if(!Character.isDigit(password.charAt(password.length()-1)))
                throw new Exception("Last character must be a digit");

            if(!password.matches(".*[@#$%&*].*"))
                throw new Exception("Password must contain special character");

            System.out.println("Strong Password");

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        checkPassword("Java@123");
    }
}
