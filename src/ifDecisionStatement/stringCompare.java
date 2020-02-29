package ifDecisionStatement;

public class stringCompare {
    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        if (a==b){
            System.out.println("hello");
        }

        String c = new String ("x");
        String d = new String ("x");

        if(c==d){
            System.out.println("world");
        }
    }
}
