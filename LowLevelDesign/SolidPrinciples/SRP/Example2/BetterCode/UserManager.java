package LowLevelDesign.SolidPrinciples.SRP.Example2.BetterCode;

public class UserManager {

    public void addUser(User user) {
        // Logic to add user
        System.out.println("User " + user.getName() + " added.");
    }

    public void removeUser(User user) {
        // Logic to remove user
        System.out.println("User " + user.getName() + " removed.");
    }

    public void sendEmail(User user, String message) {
        // Logic to send email
        System.out.println("Sending email to " + user.getEmail() + ": " + message);
    }
}
