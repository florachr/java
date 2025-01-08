package gr.aueb.dt.chapter3;

import java.util.Scanner;

/*
It print a menu util the user exits
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0 ;

        do {
            System.out.println("choose one of the following: ");
            System.out.println("1.insert a product");
            System.out.println("2.delete a product");
            System.out.println("3.exit");
            choice=in.nextInt();


        }
        while (choice != 3) ;
        System.out.println("thanks for using the app");
    }
}
