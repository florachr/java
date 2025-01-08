package gr.aueb.dt.chapter3;

public class EternalWhile {
    public static void main(String[] args) {
        int i =1;

        while (i<0){
            System.out.println("never gets in");
        }
    while (i<=1){
        System.out.println("only one iteration");
        i++;
    }
    while(true){
        System.out.println("executed for ever");
    }
    }

}
