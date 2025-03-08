package iuh.fit.se.ex3;

public class PaymentDecorator implements PaymentMethod {
    protected PaymentMethod paymentMethod;

    public PaymentDecorator(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void processPayment(double amount) {
        paymentMethod.processPayment(amount);
    }
}
