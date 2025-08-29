package LowLevelDesign.SolidPrinciples.DIP.PaymentExample.ProblematicCode;

public class Visa extends CreditCard implements IRefundCompatibleCC {

    private SameAccountRefund refundStratergies;

    public Visa() {
        this.refundStratergies = new SameAccountRefund();
    }

    @Override
    public void swipeAndPay() {
        // Implementation for swiping and paying with Visa card
        System.out.println("Swiping Visa card for payment");
    }

    @Override
    public void tapAndPay() {
        // Implementation for tapping and paying with Visa card
        System.out.println("Tapping Visa card for payment");
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment with Visa card
        System.out.println("Processing online payment with Visa card");
    }

    @Override
    public void doRefund() {
        refundStratergies.doRefund();
    }

}
