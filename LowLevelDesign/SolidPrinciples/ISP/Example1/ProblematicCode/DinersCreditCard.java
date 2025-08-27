package LowLevelDesign.SolidPrinciples.ISP.Example1.ProblematicCode;

public class DinersCreditCard extends CreditCard {

    @Override
    public void swipeAndPay() {
        // Implementation for swipe and pay
    }

    @Override
    public void doRefund() {
        throw new UnsupportedOperationException("Refunds not supported");
    }

    @Override
    public void UpiPayment() {
        // Implementation for UPI payment
    }

    @Override
    public void tapAndPay() {
        // Not applicable for DinersCreditCard
        throw new UnsupportedOperationException("Tap and Pay not supported");
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment
    }

}
