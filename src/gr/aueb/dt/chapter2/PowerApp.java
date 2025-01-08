package gr.aueb.dt.chapter2;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base;
        int power;
        int result=1 ;
        int i = 1 ;

        System.out.println("please insert base and power");
        base= in.nextInt();
        power=in.nextInt();

        while (i<=power) {
            result = result * base;
            i++;
        }
        System.out.printf("the result of %d raided into the poer of %d = %d", base , power,result);
    }
}
