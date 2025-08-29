package LowLevelDesign.SolidPrinciples.DIP.PaymentExample.BetterCode;

public class Main {
    public static void main(String[] args) {
        // Creating instances of different credit cards
        CreditCard visaCard = new Visa(new SameAccountRefund());
        CreditCard masterCard = new MasterCreditCard(new SameInstrumentRefund());

        // Using the credit cards to make payments
        visaCard.swipeAndPay();
        masterCard.onlinePayment();

        // Processing refunds
        if (visaCard instanceof IRefundCompatibleCC) {
            ((IRefundCompatibleCC) visaCard).doRefund();
        }
        if (masterCard instanceof IRefundCompatibleCC) {
            ((IRefundCompatibleCC) masterCard).doRefund();
        }
    }
}
