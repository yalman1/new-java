package ifDecisionStatement;

import java.util.Scanner;

public class gatesForPassengers {
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("where are you going");
        String where=scan.next();

        if (where.equalsIgnoreCase("europe")) {
            System.out.println("gate A");
        }
        else if (where.equalsIgnoreCase("africa")){
            System.out.println("gate B");
        }
        else if (where.equalsIgnoreCase("asia")){
            System.out.println("gate C");
        }
        else if(where.equalsIgnoreCase("america")){
            System.out.println("gate D");
        }
        else {
            System.out.println("wrong way");

        }

    }
}
