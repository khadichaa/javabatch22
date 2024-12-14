package Absraction;

public class PayPalPayment extends payment {
    String email;

    public PayPalPayment(String payerName, String email) {
        super(payerName);
        this.email = email;
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing the PayPal payment.....");
        System.out.println("Payer: " + payerName);
        System.out.println("Amount: $" + amount);
        System.out.println("Payment successful via Paypal Account");

    }
}