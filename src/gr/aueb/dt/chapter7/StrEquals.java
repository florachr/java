package gr.aueb.dt.chapter7;

public class StrEquals {
    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Coding2";

        System.out.printf("The two strings are equal: %b", (s1.equals(s2)));

        if (s1.compareTo(s2)>0) {
            System.out.println("s1>s2");

        } else if (s1.compareTo(s2)<0) {
            System.out.println("s1<s2");


        }else {
            //if (s1.compareTo(s2)==0
            System.out.println("s1.equals(s2)");
        }

    }
}
