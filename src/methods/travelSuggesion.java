package methods;
import java.util.Scanner;
public class travelSuggesion {
    public static void main(String[] args) {
        suggestDestination();
    }


    public static String suggestDestination(){
        Scanner myScan = new Scanner(System.in);
        String destination="";
        System.out.print("Sea or Mountain? :");
        String answer=myScan.nextLine();
        if(answer.equalsIgnoreCase("sea")){
            System.out.print("East or West? :");
            answer=myScan.nextLine();
            if(answer.equalsIgnoreCase("east")){
                destination="Florida";
            }
            else if(answer.equalsIgnoreCase("west")){
                destination="California";
            }
            else{
                System.out.println("Wrong input");
            }
        }
        else if(answer.equalsIgnoreCase("mountain")){
            System.out.print("Midland or North? :");
            answer=myScan.nextLine();
            if(answer.equalsIgnoreCase("midland")){
                destination="Kansas";
            }
            else if(answer.equalsIgnoreCase("north")){
                destination="Vermont";
            }
            else{
                System.out.println("Wrong input");
            }
        }
        else {
            System.out.println("Wrong input");
        }
        return destination;
    }

}
