package LowLevelDesign.SolidPrinciples.ISP.Example1.ProblematicCode;

public class MasterCardCreditCard extends CreditCard {

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
        // Not applicable for MasterCardCreditCard
        throw new UnsupportedOperationException("UPI Payment not supported");
    }

    @Override
    public void tapAndPay() {
        // Implementation for tap and pay
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment
    }

}
