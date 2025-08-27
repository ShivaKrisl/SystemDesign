package LowLevelDesign.SolidPrinciples.ISP.Example1.BetterCode;

public class VisaCreditCard extends CreditCard
        implements IRefuntCompatibleCreditCard, ITapAndPayCompatibleCreditCard {

    @Override
    public void swipeAndPay() {
        // Implementation for swipe and pay
    }

    @Override
    public void doRefund() {
        // Implementation for refund
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
