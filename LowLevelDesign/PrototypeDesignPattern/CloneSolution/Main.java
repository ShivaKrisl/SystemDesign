package LowLevelDesign.PrototypeDesignPattern.CloneSolution;

public class Main {
    public static void main(String[] args) {
        // Creating an original Email object
        Email mainObj = new Email("sender@gmail.com", "", "Test Subject", "This is a test email body.");
        // Using the clone method to create a new Email object
        Email copiedObj = mainObj.clone();
        copiedObj.setReceiver("rec@gmail.com");
        // Displaying details of the copy Email object
        copiedObj.displayEmail();

        System.out.println("--------------Premium Email----------------");
        // Creating an original PremiumEmail object
        PremiumEmail premiumEmail = new PremiumEmail("presender@gmail.com", "", "PreTest Subject",
                "This is a premium test email body.", "High Priority");
        // Using the clone method to create a new PremiumEmail object
        PremiumEmail copiedPremiumEmail = premiumEmail.clone();
        copiedPremiumEmail.setReceiver("prerec@gmail.com");
        // Displaying details of the copied PremiumEmail object
        copiedPremiumEmail.displayEmail();

    }
}
