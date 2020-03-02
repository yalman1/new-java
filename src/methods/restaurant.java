package methods;
import java.util.Scanner;
public class restaurant {
    public static void showMenu(){
        System.out.println("\t\tMENU\n____________________");
        System.out.println("\tSOUP\n---------------");
        System.out.println("lentil\t\t$3.99");
        System.out.println("tomato\t\t$4.99");
        System.out.println("fish\t\t$8.99");
        System.out.println("\tMEALS\n---------------");
        System.out.println("Rise\t\t$3.99");
        System.out.println("Chicken\t\t$5.99");
        System.out.println("Beef\t\t$7.99");
        System.out.println("\tSALAD\n---------------");
        System.out.println("Ceaser\t\t$3.99");
        System.out.println("Waldorf\t\t$3.99");
    }
    public static void showBill(int soup, int meal,int salad){
        double total=0;
        System.out.println("\n\tRECEIPT\n_______________");
        if (soup==1){
            System.out.println("Lentil\t:\t\t\t$3.99");
            total+=3.99;
        }
        else if (soup==2){
            System.out.println("Tomato\t:\t\t\t$4.99");
            total+=4.99;
        }
        else {
            System.out.println("Fish\t:\t\t\t$8.99");
            total+=8.99;
        }
        if (meal==1){
            System.out.println("Rice\t:\t\t\t$3.99");
            total+=3.99;
        }
        else if (meal==2){
            System.out.println("Chicken\t:\t\t\t$5.99");
            total+=5.99;
        }
        else {
            System.out.println("beef\t:\t\t\t$7.99");
            total+=7.99;
        }
        if (salad==1){
            System.out.println("ceaser\t:\t\t\t$2.99");
            total+=2.99;
        }
        else {
            System.out.println("waldorf\t:\t\t\t$3.99");
            total+=3.99;
        }
        System.out.println("\t\ttotal:\t\t$"+total);
    }


}
