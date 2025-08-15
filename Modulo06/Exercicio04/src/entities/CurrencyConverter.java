package entities;

public class CurrencyConverter {

    public static double convertToDollar(double dollarValue, double dollarAmount){
        double total = dollarAmount * dollarValue;
        double tax = total * 0.06; // 6% de imposto
        return total + tax;
    }

}
