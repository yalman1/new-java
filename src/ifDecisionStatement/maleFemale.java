package ifDecisionStatement;
import java.util.Scanner;
public class maleFemale {
    public static void main(String[] args) {
        Scanner myScan = new Scanner (System.in);
        System.out.println("please enter your gender");
        String myGender = myScan.next();
        String gender1 ="M";
        String gender2 ="F";
        if (gender1.equals("M")){
            System.out.println("male");
        }
        else if(gender2.equals("F")) {
            System.out.println("felame");
        }
            else {
            System.out.println("plaese enter M or F");

            }
        }


    }

