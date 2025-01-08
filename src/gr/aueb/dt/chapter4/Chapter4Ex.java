package gr.aueb.dt.chapter4;

import java.util.Scanner;

public class Chapter4Ex { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of stars (n): ");
    int n = scanner.nextInt();

    // Display n horizontal stars
    System.out.println("Horizontal Stars:");
    for (int i = 0; i < n; i++) {
        System.out.print("*");
    }
    System.out.println();

    // Display n vertical stars
    System.out.println("Vertical Stars:");
    for (int i = 0; i < n; i++) {
        System.out.println("*");
    }

    // Display n x n grid of stars
    System.out.println("n rows with n stars:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Display stars from 1 to n
    System.out.println("StarsAcs:");
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Display stars from n to 1
    System.out.println("StarsDesc:");
    for (int i = 1; i <= n; i++) {
        for (int j = n; j >= i; j--) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
