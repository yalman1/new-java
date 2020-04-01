package ifDecisionStatement;
import java.util.Scanner;
public class animalTree {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("does the animal breathe air?");
        String answer1=scan.next();
        System.out.println("does the animal lay eggs?");
        String answer2=scan.next();

        if (answer1.equalsIgnoreCase("yes")){
           if (answer2.equalsIgnoreCase("yes")){
               System.out.println("bird");
           }
           else {
               System.out.println("mammal");
           }
        }
        else {
            System.out.println("fish");
        }

    }
}
