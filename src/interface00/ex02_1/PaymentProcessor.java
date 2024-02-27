package interface00.ex02_1;

public class PaymentProcessor {

    private Payment payment;
    private int amount;

    public void setPayment(Payment payment, int amount) {
        payment.pay(amount);
    }
}
