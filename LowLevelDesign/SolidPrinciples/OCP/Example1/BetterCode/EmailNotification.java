package LowLevelDesign.SolidPrinciples.OCP.Example1.ProblematicCode;

public class EmailNotification implements INotification {

    @Override
    public void send(String message) {
        // Implementation for sending Email
        System.out.println("Sending Email: " + message);
    }
}
