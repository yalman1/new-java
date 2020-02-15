package First;
import java.util.Scanner;
public class loopUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter starting point :");
        int start =scan.nextInt();
        System.out.println("enter end point : ");
        int end =scan.nextInt();
        System.out.println("enter what you want to print ; ");
        String toPrint=scan.next();

        for (int i=start; i<end; i++ );
        System.out.println(toPrint);
    }
}
