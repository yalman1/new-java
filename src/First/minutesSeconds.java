package First;
import java.util.Scanner;
public class minutesSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter second 1-300");
        int time = scan.nextInt();

        if (time <= 60) {
            System.out.println("1 minute");
        }
        else if (time <= 120) {
            System.out.println("2 minutes");
        }
        else if (time <= 180) {
            System.out.println("3 minutes ");
        }
        else if (time<=240) {
            System.out.println("4 minutes");
        }
        else if(time<=300) {
            System.out.println("5 minutes ");
            }
        else {
            System.out.println("the second must be between 1-300");
        }

        }

    }
