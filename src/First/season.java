package First;
import java.util.Scanner;
public class season {
    public static void main(String[] args) {
        // asking temperature from user
        Scanner num= new Scanner (System.in);
        System.out.println("enter a temparature :");
        int tem =num.nextInt();
        // checking temperature
        if(tem<=20) {
            System.out.println("winter ");
        }
        else if(tem>20 && tem <41) {
            System.out.println("fall ");
        }
        else if(tem>40 && tem<61 ){
            System.out.println("spring ");
        }
        else {
            System.out.println("summer ");
        }
        }
    }

