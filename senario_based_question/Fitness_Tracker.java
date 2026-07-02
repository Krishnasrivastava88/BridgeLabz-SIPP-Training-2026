package senario_based_question;

public class Fitness_Tracker implements Trackable, Reportable, Notifiable {

    String userName;

    public Fitness_Tracker(String userName) {
        this.userName = userName;
    }

    @Override
    public void logActivity() {
        System.out.println(userName + " logged today's workout.");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating fitness report for " + userName);
    }

    @Override
    public void sendAlert() {
        System.out.println("Reminder: Drink water and exercise.");
    }
}