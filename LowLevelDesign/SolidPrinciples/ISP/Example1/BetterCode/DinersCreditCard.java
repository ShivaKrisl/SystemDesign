package LowLevelDesign.SolidPrinciples.ISP.Example1.BetterCode;

public class DinersCreditCard extends CreditCard implements IUpiCompatibleCreditCard {

    @Override
    public void swipeAndPay() {
        // Implementation for swipe and pay
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
