package iuh.fit.se.ex3;

public class Paypal implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toán bằng PayPal: $" + amount);
    }
}
