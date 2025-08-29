package LowLevelDesign.SolidPrinciples.DIP.PaymentExample.BetterCode;

public class MasterCreditCard extends CreditCard implements IRefundCompatibleCC {

    private IRefundStratergies refundStratergies;

    public MasterCreditCard(IRefundStratergies refundStratergies) {
        this.refundStratergies = refundStratergies;
    }

    @Override
    public void swipeAndPay() {
        // Implementation for swiping and paying with MasterCard
        System.out.println("Swiping MasterCard for payment");
    }

    @Override
    public void tapAndPay() {
        // Implementation for tapping and paying with MasterCard
        System.out.println("Tapping MasterCard for payment");
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment with MasterCard
        System.out.println("Processing online payment with MasterCard");
    }

    @Override
    public void doRefund() {
        refundStratergies.doRefund();
    }

}
