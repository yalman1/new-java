package ifDecisionStatement;
import java.util.Scanner;
public class askUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter an integer number :");
       int number = scanner.nextInt();
        int reminder =number %2;

        if (reminder==1){
            System.out.println("odd ");

        }
        }
    }

