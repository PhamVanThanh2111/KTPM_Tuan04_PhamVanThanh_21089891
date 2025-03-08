package iuh.fit.se.ex2;

public class VATTax implements TaxStrategy {
    @Override
    public double calcTax(double valueOfProduct) {
        return valueOfProduct * 0.05;
    }
}
