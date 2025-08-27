package LowLevelDesign.SolidPrinciples.ISP.Example1.BetterCode;

public class RupayCreditCard extends CreditCard
        implements IRefuntCompatibleCreditCard, IUpiCompatibleCreditCard {

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
    public void onlinePayment() {
        // Implementation for online payment
    }

}
