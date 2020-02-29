package switchStatement;
import java.util.Scanner;
public class homework1Switch {
    public static void main(String[] args) {
        Scanner  scan = new Scanner (System.in);
        System.out.println("enter student's score");
        int math =scan.nextInt();
        int grade = 0;


        switch (math){
            case 1 :
                System.out.println("fail");
                break;
            case 59 :
                System.out.println("D");
                break;
            case 69:
                System.out.println("C");
                break;
            case 79:
                System.out.println("B");
                break;
            case 89:
                System.out.println("A");
                break;
            case 100:
                System.out.println("A+");
                break;
            default:
                System.out.println("the score must be between 0 to 100");
                break;
        }
    }
}
