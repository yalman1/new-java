package dataTypes;

public class exerciseData {
    public static void main (String []args ){
        String name ="Hello,";
        String name1 = "world";
        System.out.println(name + name1);

        double number=1234567.456;
        System.out.printf("%,10.2f\n",number );
        //\n alta gec . 10 digit al. (.2f) noktadan sonra iki digit al
        double number2=123.456;
        System.out.printf("%10.1f\n" ,number2);
        System.out.printf("%08.1f\n",number2);
        String number3="james";
        System.out.printf("%20s",number3);       //name in a filed 20 spaces wide
    }
}
