package gr.aueb.dt.chapter1;

public class AddAppDemo {

    public static void main(String[] args) {
        //Declaration and intitialization of variables
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //Commands
        result = num1 + num2 ;

        //Print the results
        System.out.println("The results is:" + result);
        System.out.printf("The result %d",+ result);

        System.out.println("The result of :" + num1 + "," + num2 + "equals:" + result);
        System.out.printf("The result of %d, %d equals %d" , num1, num2, result);


    }
}
