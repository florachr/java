package gr.aueb.dt.chapter6;

/**
 * searching is done with comparisons .
 */
public class SearchApp {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        final int SECRET = 4;
        boolean found = false;

        for (int i = 0 ; i < arr.length; i++ ) {
            if (arr[i] == SECRET ) {
                found = true ;
                break;
            }
        }
        if (found) {
            System.out.println("secret was found ");
        }else {
            System.out.println("secret not found.");
        }
    }
}
