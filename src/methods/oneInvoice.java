package methods;

public class oneInvoice {
    public static void main(String[] args) {
        System.out.println(electricBill(3000));
        System.out.println(internetBill(500));
    }
    public static String electricBill ( int consumption){
        String decision;
        if (consumption >= 500 && consumption <= 1000) {
            decision = "Good job";
        }
        else if (consumption >= 1000 && consumption <= 1500) {
            decision = "not bad";
        }
        else if (consumption > 1500) {
            decision = "Start save energy";
        }
        else {
            decision = "consumption is wrong ";
        }
        return decision;
    }
    public static String internetBill ( int speed){
        String conclusion;
        if (speed > 300) {
            conclusion = "super speed";
        }
        else if (speed > 100) {
            conclusion = "good speed";
        }
        else {
            conclusion = "unknown speed";
        }
        return conclusion;
    }

}
