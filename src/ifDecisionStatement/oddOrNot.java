package ifDecisionStatement;
import java.util.Scanner;
public class oddOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + "is even number :");
        } else {

            System.out.println(number + "is odd number :");
        }


    }
}