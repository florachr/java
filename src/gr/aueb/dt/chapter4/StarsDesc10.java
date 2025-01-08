package gr.aueb.dt.chapter4;
/*
It prints 10 stars at the first row, 9 stars
at the second row, ets.
 */
public class StarsDesc10 {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



