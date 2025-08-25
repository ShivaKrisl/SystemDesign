package LowLevelDesign.SolidPrinciples.SRP.Example2.BetterCode;

public class ActivityLogger {
    public void logUserActivity(User user, String activity) {
        // Logic to log user activity
        System.out.println("Logging activity for " + user.getName() + ": " + activity);
    }
}
