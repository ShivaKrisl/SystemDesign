package LowLevelDesign.StratergyDesignPattern.PaymentExample;

public class AmexCreditCard extends CreditCard
        implements IRefuntCompatibleCreditCard, ITapAndPayCompatibleCreditCard {

    private IRefuntCompatibleCreditCard refundStratergy;

    public AmexCreditCard(IRefuntCompatibleCreditCard refundStratergy) {
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
    public void tapAndPay() {
        // Implementation for tap and pay
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment
    }

}