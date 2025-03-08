package iuh.fit.se.ex3;

public class Ex3 {
    public static void main(String[] args) {
        // Thanh toán CreditCard thông thường
        PaymentMethod creditCard = new CreditCard();
        creditCard.processPayment(100.0);
        // Output: Thanh toán bằng CreditCard: $100.0

        // Thêm phí xử lý $5 vào CreditCard
        PaymentMethod creditCardWithFee = new ProcessingFeeDecorator(creditCard, 5.0);
        creditCardWithFee.processPayment(100.0);
        // Output:
        // Thanh toán bằng CreditCard: $105.0
        // Đã thêm phí xử lý: $5.0

        // Kết hợp cả Discount và Fee
        PaymentMethod paypal = new Paypal();
        PaymentMethod decoratedPaypal = new CodeVoucherDecorator(
                new ProcessingFeeDecorator(paypal, 5.0),
                "SALE10",
                0.1 // 10% discount
        );
        decoratedPaypal.processPayment(100.0);
        // Output:
        // Thanh toán bằng PayPal: $95.0
        // Đã thêm phí xử lý: $5.0
        // Áp dụng mã giảm giá 'SALE10': Giảm 10%
    }
}
