package First;
import java.util.Scanner;
public class multiplesNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("please enter start number:");
        int start =scan.nextInt();
        System.out.print("please enter end number:");
        int end =scan.nextInt();

        if(start<end)
        for (int i=start; i<=end; i+=5 ){
            System.out.println(i);
        }
        // end den start a yi ogren
        else {
            for (int i=end ; i>=start; i=i-5){
                System.out.println(i);
            }
        }

     }
}
