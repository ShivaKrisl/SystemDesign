package LowLevelDesign.SolidPrinciples.OCP.Example1.BetterCode;

public class SMSNotification implements INotification {

    @Override
    public void send(String message) {
        // Implementation for sending SMS
        System.out.println("Sending SMS: " + message);
    }
}
