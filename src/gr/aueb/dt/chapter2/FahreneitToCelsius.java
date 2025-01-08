package gr.aueb.dt.chapter2;
/*
 Ex.1 -A program that converts intact
 Fahrenheit temperatures to the Celsius scale
 */
import java.util.Scanner;

public class FahreneitToCelsius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Fahreneit: ");
        int fahrenheit = in.nextInt();
        int celsius = 5*(fahrenheit-32)/9;

        System.out.println("Temperature in Celsius:" + celsius);

    }
}
