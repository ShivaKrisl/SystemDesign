package LowLevelDesign.SolidPrinciples.DIP.PaymentExample.ProblematicCode;

public class RupayCard extends CreditCard implements IRefundCompatibleCC {

    private SameInstrumentRefund refundStratergies;

    public RupayCard() {
        this.refundStratergies = new SameInstrumentRefund();
    }

    @Override
    public void swipeAndPay() {
        // Implementation for swiping and paying with Rupay card
        System.out.println("Swiping Rupay card for payment");
    }

    @Override
    public void tapAndPay() {
        // Implementation for tapping and paying with Rupay card
        System.out.println("Tapping Rupay card for payment");
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment with Rupay card
        System.out.println("Processing online payment with Rupay card");
    }

    @Override
    public void doRefund() {
        refundStratergies.doRefund();
    }
}
