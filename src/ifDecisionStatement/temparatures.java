package ifDecisionStatement;
import java.util.Scanner;
public class temparatures {
    public static void main (String []args ){

        Scanner scanNumber =new Scanner (System.in);
        System.out.println("enter temperature ");
        int temp =scanNumber.nextInt();
        if(temp<=30){
            System.out.println(" wear a jacket");
        }
        else {
            System.out.println("wear a hat ");
        }
    }
}
