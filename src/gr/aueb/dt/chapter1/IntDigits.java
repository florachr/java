package gr.aueb.dt.chapter1;

import java.util.Scanner;

/**
 * The user inserts an int with two digits, the output will the sum of the digits of the int,
 * for instance if the user inserts 23 the output should be 5.
 */
public class IntDigits {

 public static void main(String[] args) {

  int inputNum ;
  Scanner in = new Scanner (System.in);
  int leftDigit;
  int rightDigit;
  int sum;
// (0 , 9 ) (2)
  System.out.println("please insert a two digit integer");
          inputNum = in.nextInt();
                  leftDigit = inputNum /10;
                          rightDigit = inputNum % 10;
                          sum = leftDigit + rightDigit;

  System.out.printf("The sum of digits of %d is %d\n" , inputNum , sum);
 }
  }

