package LowLevelDesign.SolidPrinciples.ISP.Example1.ProblematicCode;

public class RupayCreditCard extends CreditCard {

    @Override
    public void swipeAndPay() {
        // Implementation for swipe and pay
    }

    @Override
    public void doRefund() {
        // Implementation for refund
    }

    @Override
    public void UpiPayment() {
        // Implementation for UPI payment
    }

    @Override
    public void tapAndPay() {
        // Not applicable for RupayCreditCard
        throw new UnsupportedOperationException("Tap and Pay not supported");
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment
    }

}
