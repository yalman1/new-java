package methods;

import java.util.Scanner;

public class methodsVoid {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("enter base number: ");
        int base =scan.nextInt();
        System.out.print("Enter power number:");
        int power = scan.nextInt();

        System.out.println((int)Math.pow(base,power));
    }
}
