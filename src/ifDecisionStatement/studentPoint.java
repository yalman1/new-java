package ifDecisionStatement;
import java.util.Scanner;
public class studentPoint {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("please enter students' point:");
        int math =scan.nextInt();

        if(math<=50){
            System.out.println("math:F");
        }
        else if (math<=60){
            System.out.println("math:D");
        }
        else if (math<=80){
            System.out.println("math:C");
        }
        else if (math<=90){
            System.out.println("math:B");
        }
        else {
            System.out.println("math:A");
        }
        }
}
