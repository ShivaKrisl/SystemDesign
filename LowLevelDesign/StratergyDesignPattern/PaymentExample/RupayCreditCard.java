package LowLevelDesign.StratergyDesignPattern.PaymentExample;

public class RupayCreditCard extends CreditCard
        implements IRefuntCompatibleCreditCard, IUpiCompatibleCreditCard {

    private IRefuntCompatibleCreditCard refundStratergy;

    public RupayCreditCard(IRefuntCompatibleCreditCard refundStratergy) {
        this.refundStratergy = refundStratergy;
    }

    @Override
    public void swipeAndPay() {
        // Implementation for swipe and pay
    }

    @Override
    public void doRefund() {
        // Implementation for refund
        this.refundStratergy.doRefund();
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
