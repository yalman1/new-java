package dataTypes;
import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        Scanner readKeyboard = new Scanner (System.in);

        System.out.println ("Please write your name");
        String myName = readKeyboard.nextLine ();
        System.out.println ("Your name is:"+myName);



    }
}


