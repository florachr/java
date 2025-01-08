package gr.aueb.dt.chapter2;

import java.util.Scanner;

/*
The user inserts a series of integers and the program counts the number
of positives while when the user inserts a negative number the while exits and program finishes
 */
public class PostivesCountApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int positivesCount = 0;
        int inputNum;

        System.out.println("please insert a num");
        inputNum = in.nextInt ();

        while (inputNum >= 0) {
            positivesCount ++ ;
            System.out.println("please insert another integer");
            inputNum = in.nextInt();


        }
        System.out.println("positive count:"+ positivesCount);

    }
}

