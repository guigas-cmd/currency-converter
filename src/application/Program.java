package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter cc = new CurrencyConverter();


        System.out.println("Choose currency: (1) Dollar (2) Euro");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Whats is the dollar price? ");
            cc.dollar = sc.nextDouble();
            System.out.println("How many dollars will be bought? ");
            cc.reais = sc.nextDouble();

            System.out.printf("Amount to be paid in reais = %.2f \n", cc.paidInReaisDollar());
        } else if (choice == 2) {
            System.out.println("Whats is the euro price? ");
            cc.euro = sc.nextDouble();
            System.out.println("How many euros will be bought? ");
            cc.reais = sc.nextDouble();

            System.out.printf("Amount to be paid in reais = %.2f \n", cc.paidInReaisEuro());
        } else {
            System.out.println("invalid option");
        }

        sc.close();
    }
}
