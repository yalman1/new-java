package ifDecisionStatement;
import java.util.Scanner;
public class assignment {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("itemID" + "     "+"quantity"+ "     "+"Price");
        System.out.println("_____________________________________________________");

        System.out.println("Quantity");
        int num1=scan.nextInt();
        System.out.println("item1");
        int id1=scan.nextInt();
        int id2=scan.nextInt();
        int id3=scan.nextInt();
        int id4=scan.nextInt();
        int id5=scan.nextInt();

        float total1=0;


        if (id1==num1){
            total1=num1*4.79f;
            System.out.println(id1 + "\t\t" + num1+"\t\t"+"$"+(num1*4.79));
        }
        else if (id2==num1){
            total1=num1*1.65f;
            System.out.println(id2 + "\t\t" + num1+"\t\t"+"$"+(num1*1.65));
        }

        else if (id3==num1){
            total1=num1*3.88f;
            System.out.println(id3 + "\t\t" + num1+"\t\t"+"$"+(num1*3.88));
        }

        else if (id4==num1){
            total1=num1*0.99f;
            System.out.println(id4 + "\t\t" + num1+"\t\t"+"$"+(num1*0.99));
        }

        else if(id5==num1) {
            total1 = num1 * 4.21f;
            System.out.println(id5 + "\t\t" + num1+"\t\t"+"$"+(num1*4.21));
        }
        else{
            System.out.println("wrong id");
        }

    }
}
