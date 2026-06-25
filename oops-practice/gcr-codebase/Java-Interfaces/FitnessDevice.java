interface Trackable {

    void logActivity();

    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}

interface Reportable {

    void generateReport();
}

interface Notifiable {

    void sendAlert();
}

public class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity Logged: 5000 steps completed.");
    }

    @Override
    public void generateReport() {
        System.out.println("Report: Calories Burned = 350");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Time for your workout!");
    }

    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();

        System.out.println("\nFitnessDevice implements multiple interfaces.");
        System.out.println("Java supports multiple inheritance using interfaces.");
        System.out.println("Java does not support multiple inheritance using classes.");
    }
}
