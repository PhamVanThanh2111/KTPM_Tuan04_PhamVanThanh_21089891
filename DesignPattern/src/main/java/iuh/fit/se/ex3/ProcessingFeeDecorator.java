package iuh.fit.se.ex3;

public class ProcessingFeeDecorator extends PaymentDecorator {
    private final double fee;

    public ProcessingFeeDecorator(PaymentMethod paymentMethod, double fee) {
        super(paymentMethod);
        this.fee = fee;
    }

    @Override
    public void processPayment(double amount) {
        double totalAmount = amount + fee;
        super.processPayment(totalAmount);
        System.out.println("Đã thêm phí xử lý: $" + totalAmount);
    }
}
