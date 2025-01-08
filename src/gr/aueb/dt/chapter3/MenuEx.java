package gr.aueb.dt.chapter3;

import java.util.Scanner;

public class MenuEx {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int choice = 0;

            do {
                System.out.println("Choose one of the below or 5 to exit:");
                System.out.println("1. Introduction");
                System.out.println("2. Deletion");
                System.out.println("3. Update");
                System.out.println("4. Search");
                System.out.println("5. Exit");

                choice = in.nextInt();

                if (choice == 1) {
                    System.out.println("Successful Introduction");
                } else if (choice == 2) {
                    System.out.println("Successful Deletion");
                } else if (choice == 3) {
                    System.out.println("Successful Update");
                } else if (choice == 4) {
                    System.out.println("Successful Search");
                } else if (choice == 5) {
                    System.out.println("Successful Exit");
                } else {
                    System.out.println("Wrong number");
                }
            } while (choice != 5);
            System.out.println("Goodbye");
    }

}
