package LowLevelDesign.SolidPrinciples.DIP.PaymentExample.ProblematicCode;

public class DinersCard extends CreditCard {

    @Override
    public void swipeAndPay() {
        // Implementation for swiping and paying with Diners card
        System.out.println("Swiping Diners card for payment");
    }

    @Override
    public void tapAndPay() {
        // Implementation for tapping and paying with Diners card
        System.out.println("Tapping Diners card for payment");
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment with Diners card
        System.out.println("Processing online payment with Diners card");
    }

}
