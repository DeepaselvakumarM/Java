abstract class Payment {
    private double amount;
    public Payment(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public abstract void makePayment();
}
class CreditCard extends Payment {
    private String cardNumber;
    private String cardHolderName;

    public CreditCard(double amount, String cardNumber, String cardHolderName) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    public void makePayment() {
        System.out.println("Processing credit card payment of $" + getAmount() + " for card holder " + cardHolderName);
        System.out.println("Payment successful using Credit Card: " + cardNumber);
    }
}
class Upi extends Payment {
    private String upiID;

    public Upi(double amount, String upiID) {
        super(amount);
        this.upiID = upiID;
    }
    @Override
    public void makePayment() {
        System.out.println("Processing UPI payment of $" + getAmount() + " using UPI ID: " + upiID);
        System.out.println("Payment successful using UPI ID: " + upiID);
    }
}
class PaymentProcessor {
    public void processPayment(Payment payment) {
        payment.makePayment();
    }
}
public class Poly {
    public static void main(String[] args) {
        double total = 200.00;
        Payment credit = new CreditCard(total, "1234-5678-9101-1121", "John Doe");
        Payment upi = new Upi(total, "john@upi");
        PaymentProcessor pay = new PaymentProcessor();
        System.out.println("Paying with Credit Card:");
        pay.processPayment(credit);
        System.out.println("\nPaying with UPI:");
        pay.processPayment(upi);
    }
}
