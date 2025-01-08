package gr.aueb.dt.chapter6;

public class ArraysApps {

    public static void main(String[] args) {

    }
    public static int sum (int[] arr) {
        int sum = 0 ;

        for (int el : arr ) {
            sum +=el; // sum= sum + el;
        }
        return sum;
    }
    public static double avg (int [] arr) {
     return sum(arr) / (double) arr.length;
         }
}
