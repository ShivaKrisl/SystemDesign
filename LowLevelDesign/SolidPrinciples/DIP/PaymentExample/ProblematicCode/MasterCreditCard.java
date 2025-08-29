package LowLevelDesign.SolidPrinciples.DIP.PaymentExample.ProblematicCode;

public class MasterCreditCard extends CreditCard implements IRefundCompatibleCC {

    private SameAccountRefund refundStratergies;

    public MasterCreditCard() {
        this.refundStratergies = new SameAccountRefund();
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
