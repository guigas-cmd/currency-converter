package entities;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double converter(double dollarPrice, double reaisPrice) {
        return dollarPrice * reaisPrice * (1.0 + IOF);

    }
}
