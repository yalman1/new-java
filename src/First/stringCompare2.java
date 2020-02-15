package First;

import java.security.spec.RSAOtherPrimeInfo;

public class stringCompare2 {
    public static void main(String[] args) {
        String a= "a";
        String b = "a";
        if (a.equals (b)){
            System.out.println("hello");
        }
        String c = new String ("x");
        String d = new String ("x");
        if (c.equals (d)){
            System.out.println("world");
        }

    }
}
