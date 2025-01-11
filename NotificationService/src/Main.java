import Observer.User;
import Subject.NotificationApp;

public class Main {
    public static void main(String[] args) {
        // Create subject
        NotificationApp notificationApp = new NotificationApp();

        // Create observers
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        // Add observers
        notificationApp.addObserver(user1);
        notificationApp.addObserver(user2);

        // Send notification
        System.out.println("Sending first notification...");
        notificationApp.addNOtification("Welcome to our app!");

        // Remove an observer and send another notification
        notificationApp.removeObserver(user2);
        System.out.println("\nSending second notification...");
        notificationApp.addNOtification("New feature released!");

        // Add another observer and send a final notification
        notificationApp.addObserver(user3);
        System.out.println("\nSending third notification...");
        notificationApp.addNOtification("Discount on premium subscription!");
    }
}
