package gr.aueb.dt.chapter7;

public class IntexOfSubStrApp {
    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";

        int indexOfo= s.indexOf("o"); //18
        int indexOfSecondo = s.indexOf("o,19");
        int indexOfLastO= s.lastIndexOf("o");

        String sub1 = s.substring(1);
        String sub2 = s.substring (1,3);

        for (int i=0; i<s.length(); i++){
            System.out.println(s.substring(i, i+1)+" ");
        }
    }
}
