package iuh.fit.se.ex3;

public class CodeVoucherDecorator extends PaymentDecorator {
    public final String voucherCode;
    public final double voucherRate;

    public CodeVoucherDecorator(PaymentMethod paymentMethod, String voucherCode, double voucherRate) {
        super(paymentMethod);
        this.voucherCode = voucherCode;
        this.voucherRate = voucherRate;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Sử dụng mã giảm giá " + voucherCode + " được giảm còn: $" + (amount - (amount * voucherRate)));
    }
}
