package LowLevelDesign.SolidPrinciples.OCP.Example1.ProblematicCode;
import java.util.List;

public class NotificationSender {

    public void sendNotification(List<String> types, String message) {
        for (String type : types) {
            switch (type) {
                case "EMAIL":
                    new EmailNotification().sendEmail(message);
                    break;
                case "SMS":
                    new SMSNotification().sendSMS(message);
                    break;
            }
        }
    }
}
