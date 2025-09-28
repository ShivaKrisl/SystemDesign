package LowLevelDesign.PrototypeDesignPattern.CloneSolution;

public class PremiumEmail extends Email { // we are extending Email class which is implementing IClonable interface
    private String premiumFeature;

    // Base Constructor
    PremiumEmail(String sender, String receiver, String subject, String body, String premiumFeature) {
        super(sender, receiver, subject, body);
        this.premiumFeature = premiumFeature;
    }

    // Copy Constructor
    PremiumEmail(PremiumEmail email) {
        super(email);
        this.premiumFeature = email.premiumFeature;
    }

    // Implementing clone method from IClonable interface
    @Override
    public PremiumEmail clone() {
        return new PremiumEmail(this); // this will call the copy constructor by default (we are adding layer)
    }

    // Getter and Setter for premiumFeature
    public String getPremiumFeature() {
        return premiumFeature;
    }

    public void setPremiumFeature(String premiumFeature) {
        this.premiumFeature = premiumFeature;
    }

    // Overriding displayEmail method to include premium feature
    @Override
    public void displayEmail() {
        super.displayEmail();
        System.out.println("Premium Feature: " + premiumFeature);
    }

}
