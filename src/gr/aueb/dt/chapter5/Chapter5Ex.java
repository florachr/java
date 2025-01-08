package gr.aueb.dt.chapter5;

import java.util.Scanner;

public class Chapter5Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            printMenu();
            System.out.print("Give your choice: ");
            choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Exit");
                break;
            }

            System.out.print("Number for stars: ");
            int n = scanner.nextInt();

            switch (choice) {
                case 1:
                    Stars(n);
                    break;
                case 2:
                    StarsVertically(n);
                    break;
                case 3:
                    showLinesWithNStars(n);
                    break;
                case 4:
                    IncreasingStars(n);
                    break;
                case 5:
                    DecreasingStars(n);
                    break;
                default:
                    System.out.println("Try again");
            }
        }
        scanner.close();
    }

    // Print the menu
    private static void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Show n stars horizontally");
        System.out.println("2. Show n stars vertically");
        System.out.println("3. Show n lines with n stars");
        System.out.println("4. Show n lines with stars 1 – n");
        System.out.println("5. Show n lines with stars n – 1");
        System.out.println("6. Exit the program");
    }

    // n stars horizontally
    private static void Stars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //  n stars vertically
    private static void StarsVertically(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    // n lines with n stars
    private static void showLinesWithNStars(int n) {
        for (int i = 0; i < n; i++) {
            Stars(n);
        }
    }

    // n lines with stars increasing from 1 to n
    private static void IncreasingStars(int n) {
        for (int i = 1; i <= n; i++) {
            Stars(i);
        }
    }

    // n lines with stars decreasing from n to 1
    private static void DecreasingStars(int n) {
        for (int i = n; i >= 1; i--) {
            Stars(i);
        }
    }
}
