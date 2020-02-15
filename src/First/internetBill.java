package First;
import java.util.Scanner;
public class internetBill {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("subscribed (Y/N)");
        String member = myScan.next();

        if (member.equalsIgnoreCase("Y")) {
            //ask usage
            System.out.println("enter usage please (1-100)");
            int usage =myScan.nextInt();
            if (usage < 101) {
                System.out.println("$10");

            } else {
                System.out.println("$40");
            }

        } else {
            System.out.println("please subscribe");
        }
    }
}
