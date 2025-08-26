package LowLevelDesign.SolidPrinciples.SRP.Example3.ProblematicCode;
import java.util.List;

public class NotificationSender {

    public void sendNotification(List<NotificationType> types, String message) {
        for (NotificationType type : types) {
            switch (type) {
                case EMAIL:
                    type.sendEmail(message);
                    break;
                case SMS:
                    type.sendSMS(message);
                    break;
                case PUSH:
                    type.sendPushNotification(message);
                    break;
                case WHATSAPP:
                    type.sendWhatsAppMessage(message);
                    break;
        }
    }
}
