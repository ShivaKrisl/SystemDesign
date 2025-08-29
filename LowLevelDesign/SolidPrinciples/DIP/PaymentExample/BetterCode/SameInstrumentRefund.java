package LowLevelDesign.SolidPrinciples.DIP.PaymentExample.BetterCode;

public class SameInstrumentRefund implements IRefundStratergies {

    @Override
    public void doRefund() {
        // Logic to process refund using the same credit card
        System.out.println("Processing refund to the same instrument credit card");
    }

}
