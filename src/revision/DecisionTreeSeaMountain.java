package revision;
import java.util.Scanner;
public class DecisionTreeSeaMountain {
    public static void main(String[] args) {

        implementDecision();
    }
    public static void implementDecision (){
        Scanner scan=new Scanner (System.in);
        System.out.println("sea or mountain");
        String choose=scan.next();

        if (choose.equalsIgnoreCase("Sea")){
            System.out.println("East coast or west coast? ");
            String coast=scan.next();
            if (coast.equalsIgnoreCase("East")) {
                System.out.println("florida");
            }
            else {
                System.out.println("california");
            }
        }
       else if (choose.equalsIgnoreCase("mountain")){
            System.out.println("Midland or North? ");
            String what=scan.next();
            if(what.equalsIgnoreCase("Midland") ){
                System.out.println("Kansas");
            }
            else {
                System.out.println("Vermont");
            }

        }
       else {
            System.out.println("you should choose one");
        }
    }
}
