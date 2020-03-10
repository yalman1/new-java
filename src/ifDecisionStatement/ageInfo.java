package ifDecisionStatement;
import java.util.Scanner;
public class ageInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age :");
        int age =scanner.nextInt();
        if(age<0){
            System.out.println("not negative number");
        }
        else if (age>120){
            System.out.println("can not be larger than 120");
        }
        else {
            System.out.print("ok");
        }
    }
}
