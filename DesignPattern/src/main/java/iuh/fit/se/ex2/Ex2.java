package iuh.fit.se.ex2;

public class Ex2 {
    public static void main(String[] args) {
        // Thue tieu thu
        double valueOfProduct = 100.0;

        ConsumptionTax consumptionTax = new ConsumptionTax();
        System.out.println("Thuế tiêu thụ:" + consumptionTax.calcTax(valueOfProduct));

        SpecialConsumptionTax specialConsumptionTax = new SpecialConsumptionTax();
        System.out.println("Thuế tiêu thụ đặc biệt:" + specialConsumptionTax.calcTax(valueOfProduct));

        VATTax vatTax = new VATTax();
        System.out.println("Thuế VAT: " + vatTax.calcTax(valueOfProduct));
    }
}
