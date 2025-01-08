package gr.aueb.dt.chapter6;

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = new int[3];    // default values are zero
        int[] arr2= {1,2,3,4,5,6}; // unsized initialization
        int[] arr3;
        arr3 = new int [] {1,2,3,4,5,6}; // array initializer

        arr[0] = 5;
        arr [1] = 10;
        arr[2] = 20;
        // arr [3] is not valid because the last index is 2

        // traverse

        for (int i = 0 ; i < arr.length; i ++ ) {
            System.out.print(arr[i] + "");
        }

        for (int item : arr ) { //the : we call it in -> it its item in arr
            System.out.print(item+ "");
        }


    }
}
