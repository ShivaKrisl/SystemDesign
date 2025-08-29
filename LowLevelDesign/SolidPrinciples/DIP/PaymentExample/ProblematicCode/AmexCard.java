package LowLevelDesign.SolidPrinciples.DIP.PaymentExample.ProblematicCode;

public class AmexCard extends CreditCard implements IRefundCompatibleCC {

    private SameInstrumentRefund refundStratergies;

    public AmexCard() {
        this.refundStratergies = new SameInstrumentRefund();
    }

    @Override
    public void swipeAndPay() {
        // Implementation for swiping and paying with Amex card
        System.out.println("Swiping Amex card for payment");
    }

    @Override
    public void tapAndPay() {
        // Implementation for tapping and paying with Amex card
        System.out.println("Tapping Amex card for payment");
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment with Amex card
        System.out.println("Processing online payment with Amex card");
    }

    @Override
    public void doRefund() {
        refundStratergies.doRefund();
    }

}
