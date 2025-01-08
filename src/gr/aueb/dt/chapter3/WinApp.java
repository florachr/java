package gr.aueb.dt.chapter3;

import java.util.Scanner;

public class WinApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET1=12;
        final int SECRET2=34;
        int num=0;
        boolean found = false ;

        while (true){
            System.out.println("please isnert a num");
            num=in.nextInt();

            if (num != SECRET1 && num != SECRET2) {
                System.out.println("not lucky");
                break;
            }

            if (num == SECRET1){
                found = true ;

            }else {
                found = true ;
            }
            if ( found ){
                System.out.println("you are lucky");
            }
        }
    }
}
