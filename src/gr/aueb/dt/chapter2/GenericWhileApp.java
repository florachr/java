package gr.aueb.dt.chapter2;

import java.util.Scanner;

/*
A generic while with start value, end value and step.
 */
public class GenericWhileApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int endValue = 0;
        int step = 0;
        int counter = 0;

        System.out.println("Please insert start, end, step values");
        start = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        while (start <= endValue) {
            counter++;
            start += step;
        }
            System.out.println("iterations count:" + counter);

        }

    }
