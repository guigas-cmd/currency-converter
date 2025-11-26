package entities;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double converter(double dollarPrice, double reaisPrice) {
        double totalWithoutIOF = dollarPrice * reaisPrice;
        double iofValue = totalWithoutIOF * IOF;
        return totalWithoutIOF + iofValue;

    }
}
