package LowLevelDesign.SolidPrinciples.DIP.PaymentExample.BetterCode;

public abstract class CreditCard {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    public abstract void swipeAndPay();

    public abstract void tapAndPay();

    public abstract void onlinePayment();
}