package entities;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public double dollar;
    public double reais;
    public double euro;

    public double valueDollarWithIOF() {return dollar * IOF + dollar; }
    public double valueEuroWithIOF() {return euro * IOF + euro; }

    public double paidInReaisDollar(){return valueDollarWithIOF() * reais; }
    public double paidInReaisEuro(){return valueEuroWithIOF() * reais; }

    // implement EURO

}
