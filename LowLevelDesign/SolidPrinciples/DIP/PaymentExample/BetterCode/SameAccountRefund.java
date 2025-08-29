package LowLevelDesign.SolidPrinciples.DIP.PaymentExample.BetterCode;

public class SameAccountRefund implements IRefundStratergies {

    @Override
    public void doRefund() {
        // Logic to process refund using the same bank account
        System.out.println("Processing refund to the same bank account");
    }

}
