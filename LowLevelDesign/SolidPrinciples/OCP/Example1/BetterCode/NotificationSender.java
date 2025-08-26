package LowLevelDesign.SolidPrinciples.OCP.Example1.BetterCode;
import java.util.List;

public class NotificationSender {

    public void sendNotification(List<INotification> notifications, String message) {
        for(INotification notification : notifications){
            notification.send(message);
        }
    }
}
