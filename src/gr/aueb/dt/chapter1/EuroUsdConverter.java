package gr.aueb.dt.chapter1;

import java.util.Locale;
import java.util.Scanner;

/*
Euro to USD Converter . The user will insert the amount in Euro and the program
will print the corresponding amount in USA Dollars based on a certain parity rate
 */
public class EuroUsdConverter {

    public static void main(String[] args) {
        //declaration and inistialization
        Scanner in = new Scanner(System.in);
        int inputEuros;
        final int PARITY = 99; // USA cents
        int totalUsaCents;
        int usaDollars;
        int remainingCents;

        System.out.println("Please insert the amount in Euros");
        inputEuros = in.nextInt();
        totalUsaCents=inputEuros*PARITY;
        usaDollars = totalUsaCents / 100;
        remainingCents = usaDollars % 100;

        System.out.printf(Locale.forLanguageTag("el"),
                "%d euros = %d usa cents = %d usa dollars & %d usa cents",
                inputEuros, totalUsaCents, usaDollars, remainingCents );

    }
}
