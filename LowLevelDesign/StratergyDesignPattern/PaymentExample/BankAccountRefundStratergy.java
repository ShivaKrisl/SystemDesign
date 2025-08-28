package LowLevelDesign.StratergyDesignPattern.PaymentExample;

public class BankAccountRefundStratergy implements IRefuntCompatibleCreditCard {
    @Override
    public void doRefund() {
        System.out.println("Refunding to the bank account.");
    }

}
