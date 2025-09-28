package LowLevelDesign.PrototypeDesignPattern.CloneSolution;

public class Email implements IClonable<Email> {

    private String Sender;
    private String Receiver;
    private String Subject;
    private String Body;

    // Base Constructor
    Email(String sender, String receiver, String subject, String body) {
        this.Sender = sender;
        this.Receiver = receiver;
        this.Subject = subject;
        this.Body = body;
    }

    // Copy Constructor
    Email(Email email) {
        this.Sender = email.Sender;
        this.Receiver = email.Receiver;
        this.Subject = email.Subject;
        this.Body = email.Body;
    }

    // Implementing clone method from IClonable interface
    @Override
    public Email clone() {
        return new Email(this); // this will call the copy constructor by default (we are adding layer)
    }

    // Getters and Setters
    public String getSender() {
        return Sender;
    }

    public void setSender(String sender) {
        Sender = sender;
    }

    public String getReceiver() {
        return Receiver;
    }

    public void setReceiver(String receiver) {
        Receiver = receiver;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    // Method to display email details
    public void displayEmail() {
        System.out.println("Sender: " + Sender);
        System.out.println("Receiver: " + Receiver);
        System.out.println("Subject: " + Subject);
        System.out.println("Body: " + Body);
    }

}