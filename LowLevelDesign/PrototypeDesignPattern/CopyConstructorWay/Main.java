public class Main {

    public static void main(String[] args) {
        // Creating an original Email object
        Email mainObj = new Email("sender@gmail.com", "", "Test Subject", "This is a test email body.");

        // Using the copy constructor to create a new Email object
        Email copiedObj = new Email(mainObj);
        copiedObj.setReceiver("receiver@gmail.com");

        // Displaying details of the copy Email object
        copiedObj.displayEmail();

    }
}