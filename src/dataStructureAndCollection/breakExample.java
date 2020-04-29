package dataStructureAndCollection;

import java.util.Scanner;

public class breakExample {
    public static void main(String[] args) {
        for(int i=0 ;i < 10 ; i++){
            System.out.println(i);
            if(i==6){
                System.out.println("It is 6");
                break;
            }
        }
        Scanner scan = new Scanner(System.in);
        int number;
        while(true){
            System.out.println("Enter number :");
            number = scan.nextInt();
            if(number==0){
                break;
            }
        }
    }
}
