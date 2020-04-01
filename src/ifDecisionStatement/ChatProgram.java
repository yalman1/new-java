package ifDecisionStatement;
import java.util.Scanner;
public class ChatProgram {
    public static void main(String[] args) {

            String answer=" ";
            Scanner myScan = new Scanner(System.in);
            while(!answer.equalsIgnoreCase("hello")){
                System.out.print("Talk little bit: ");
                answer=myScan.nextLine();
                if(!answer.equalsIgnoreCase("hello")) {
                    System.out.println(" You said  " + answer);
                }
            }
            System.out.println("I knew I will win!!!");

        }

}
