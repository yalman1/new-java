package hashMap;

import java.util.ArrayList;
import java.util.Scanner;

public class QueryQuestion {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        Scanner scan=new Scanner (System.in);
        int number=1;
            while (number!=0){
                System.out.println("Enter number");
                number=scan.nextInt();
                list.add(number);
                System.out.println(list);
        }
    }
}
