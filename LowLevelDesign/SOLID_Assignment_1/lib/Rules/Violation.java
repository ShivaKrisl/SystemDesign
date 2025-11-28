package LowLevelDesign.SOLID_Assignment_1.lib.Rules;

public class Violation {

    private final String message;

    public Violation(String message) {
        this.message = message;
    }

    // returns Voilation object with message
    // why static => so that we don't need to create object of Violation class to
    // call this method
    public static Violation of(String message) {
        return new Violation(message);
    }

}
