package gr.aueb.dt.chapter2;
/*
it finds the sum of the first 10 integers, that is 1+2+3+...+10
 */
public class Sum10 {
    public static void main(String[] args) {

        int sum = 0 ;
        int mul = 1;
        int i = 1 ;
        int j = 1 ;

        while (i <= 10 ) {
            sum = sum + i ;
            i++;

        }

        while (j <= 10 ) {
            mul = mul * j;
            j++;
        }

        System.out.println("sum="+sum);
        System.out.println("mul="+mul);
    }
}
