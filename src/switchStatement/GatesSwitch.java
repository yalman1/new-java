package switchStatement;

public class GatesSwitch {
    public static void main(String[] args) {
        String destination ="america";
        destination=destination.toLowerCase();
        switch (destination){
            case "europe":
                System.out.println("gate A");
                break;
            case"africa":
                System.out.println("gate B");
                break;
            case "asia":
                System.out.println("gate C");
                break;
            case "america":
                System.out.println("gate D");
                break;
            default:
                System.out.println("not a destination");
                break;


        }
    }
}
