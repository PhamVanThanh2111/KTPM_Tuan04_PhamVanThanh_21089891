package iuh.fit.se.ex2;

// thue tieu thu
public class ConsumptionTax implements TaxStrategy {

    @Override
    public double calcTax(double valueOfProduct) {
        return valueOfProduct * 0.20;
    }
}
