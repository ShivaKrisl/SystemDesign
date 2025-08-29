package LowLevelDesign.SolidPrinciples.DIP.PaymentExample.BetterCode;

public class Visa extends CreditCard implements IRefundCompatibleCC {

    private IRefundStratergies refundStratergies;

    public Visa(IRefundStratergies refundStratergies) {
        this.refundStratergies = refundStratergies;
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
