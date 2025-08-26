package LowLevelDesign.SolidPrinciples.SRP.Example3.ProblematicCode;

public enum NotificationType {
    EMAIL,
    SMS,
    PUSH,
    WHATSAPP;

    public void sendSMS(String message) {
        // Implementation for sending SMS
        System.out.println("Sending SMS: " + message);
    }

    public void sendEmail(String message) {
        // Implementation for sending Email
        System.out.println("Sending Email: " + message);
    }

    public void sendPushNotification(String message) {
        // Implementation for sending Push Notification
        System.out.println("Sending Push Notification: " + message);
    }

    public void sendWhatsAppMessage(String message) {
        // Implementation for sending WhatsApp Message
        System.out.println("Sending WhatsApp Message: " + message);
    }
}
