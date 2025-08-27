package LowLevelDesign.SolidPrinciples.ISP.Example1.BetterCode;

public abstract class CreditCard {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    public abstract void swipeAndPay();

    public abstract void onlinePayment();

}