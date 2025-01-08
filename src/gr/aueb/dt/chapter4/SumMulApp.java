package gr.aueb.dt.chapter4;
/*
it calculates the sum and mul of the first 10 integers 1-10
 */
public class SumMulApp {
    public static void main(String[] args) {
        int sum=0;
        int mul=1;

        for (int i=1; i<=10; i++){
            sum+=i;//sum= sum+i;
            mul*=i;//mul=mul*i;
        }
        System.out.println("sum:"+sum);
        System.out.printf("mul: %,d",mul);
    }

}
