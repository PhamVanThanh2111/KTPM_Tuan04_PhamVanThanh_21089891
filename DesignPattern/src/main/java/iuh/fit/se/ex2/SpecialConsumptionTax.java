package iuh.fit.se.ex2;

public class SpecialConsumptionTax implements TaxStrategy {
    @Override
    public double calcTax(double valueOfProduct) {
        return valueOfProduct * 0.40;
    }
}
