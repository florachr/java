package gr.aueb.dt.chapter2;

import java.util.Scanner;

/*
The user inserts the nyumber of stars to print out (horizontaly )

 */
public class GenericStarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stars = 0 ;
        int i  = 1;

        System.out.println("Please insert the number of stars");
        stars = in.nextInt();

        while (i <= stars ) {
            System.out.print("*");
            i++;


        }

    }


}
