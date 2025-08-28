package LowLevelDesign.StratergyDesignPattern.PaymentExample;

public class SameInstrumentRefundStratergy implements IRefuntCompatibleCreditCard {
    @Override
    public void doRefund() {
        System.out.println("Refunding " + " to the same payment instrument.");
    }

}
