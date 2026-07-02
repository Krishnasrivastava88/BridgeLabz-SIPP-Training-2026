package scenario_based_question;

public class Main {

    public static void main(String[] args) {

        Fitness_Tracker tracker = new Fitness_Tracker("Krishna");

        tracker.logActivity();
        tracker.generateReport();
        tracker.sendAlert();
        tracker.resetData();

        System.out.println();

        System.out.println(tracker instanceof Trackable);
        System.out.println(tracker instanceof Reportable);
        System.out.println(tracker instanceof Notifiable);
        System.out.println(tracker instanceof Fitness_Tracker);
    }
}