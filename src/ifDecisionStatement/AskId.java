package ifDecisionStatement;
import java.util.Scanner;
public class AskId {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("dou you have building ID?");
        boolean id=scan.nextBoolean();
        System.out.println("do you have IT room ID?");
        boolean itId=scan.nextBoolean();
        if (id){
            System.out.println("you can pass");
            if (itId){
                System.out.println("please enter");
            }
            else {
                System.out.println("you should have IT room ID");
            }
        }
        else{
            System.out.println("you can't pass");
        }


    }
}
