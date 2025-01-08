package gr.aueb.dt.chapter7;

public class ImmutableStr {
    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Coding";

        s2 = "Athens Uni of Eco and Bus";
        s1 = "Hello";

        for (int i = 0; i < s1.length(); i++){
            System.out.print(s1.charAt(i)+" ");
        }
    }
}
