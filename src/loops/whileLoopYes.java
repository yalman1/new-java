package loops;
import java.util.Scanner;
public class whileLoopYes {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);

        String answer ="";
             while (!answer.equalsIgnoreCase("y")){
                 System.out.println("Java is fun (y/n)");
                 answer =scan.next();
        }
        System.out.println("i knew you like Java");


             int x=5;
             while (x<7)
                 System.out.println(" i");
             x++;
    }



}
