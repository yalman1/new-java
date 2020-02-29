package ifDecisionStatement;
import java.util.Scanner;
public class ornekFatura {
    public static void main(String[] args) {
        Scanner myScan =new Scanner (System.in);


        String ID1 = "123";
        String ID2 = "124";
        String ID3 = "125";
        String ID4 = "126";
        String ID5 = "127";
        float price1 = 2.49f  ;
        float price2 = 4.79f ;
       float price3 = 1.65f ;
        float price4 = 7.88f ;
       float price5 = 0.99f ;
        System.out.println("what is Id1 number");
        int item1 = myScan.nextInt();
        System.out.println("what is quantity1");
        int quantity1 = myScan.nextInt();

        System.out.println("what is Id2 number");
        int item2 = myScan.nextInt();
        System.out.println("what is quantity2");
        int quantity2 = myScan.nextInt();

        System.out.println("what is Id3 number");
        int item3 = myScan.nextInt();
        System.out.println("what is quantity3");
        int quantity3 = myScan.nextInt();

        System.out.println("what is Id4 number");
        int item4 = myScan.nextInt();
        System.out.println("what is quantity4");
        int quantity4 = myScan.nextInt();

        System.out.println("what is Id5 number");
        int item5 = myScan.nextInt();
        System.out.println("what is quantity5");
        int quantity5 = myScan.nextInt();

        System.out.println("itemID" + "     "+"quantity"+ "     "+"Price");
        System.out.println("_____________________________________________________");
        if (item1 ==123);
        System.out.println(ID1 + "\t\t" + quantity1+"\t\t"+"$"+(quantity1*price1));
        if (item2 ==124);
        System.out.println(ID2 +"\t\t"+ quantity2+"\t\t"+ "$"+(quantity2*price2));
        if (item1 ==125);
        System.out.println(ID3 +"\t\t"+ quantity3+"\t\t" + "$"+(quantity3*price3));
        if (item1 ==126);
        System.out.println(ID4 +"\t\t"+ quantity4+"\t\t" + "$" + (quantity4*price4));
        if (item1 ==127);
        System.out.println(ID5 +"\t\t"+ quantity5+"\t\t" + "$"+(quantity5*price5));

        System.out.println("\t\tTotal: "+ "$"+(price1+price2+price3+price4+price5));
    }
}
