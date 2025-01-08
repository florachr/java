package gr.aueb.dt.chapter2;
/*
EX.2 - A program that reads from the user 3 integers representing day, month, year and
displays it in the form of DD/MM/YY
 */
import java.util.Scanner;

public class DateEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = in.nextInt();
        System.out.print("Enter month: ");
        int month = in.nextInt();
        System.out.print("Enter year: ");
   int year = in.nextInt();

        System.out.printf("%02d/%02d/%02d\n", day, month, year % 100);
  }
    }

