package gr.aueb.dt.chapter2;

import java.util.Arrays;
import java.util.Scanner;

/*
The user inserts the current temperature and also
inserts if it is raining or not . The program decides
if it is snowing , that is if it is raining and the temp is below zero.
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        boolean isRaining = false;
        boolean isSnowing = false;
        int temperature = 0;

        System.out.println("please insert if its raining or not true / false");
        isRaining= in.nextBoolean();

        System.out.println("Please insert the temperature");
        temperature = in.nextInt();

        isSnowing = isRaining && (temperature < 0 );

        System.out.println("is snowing:" + isSnowing);


    }
}
