package revision;

import org.w3c.dom.ls.LSOutput;

public class methodDataTypes {
    public static void main(String[] args) {
        System.out.println(add(2,4));
        addDouble(4.9,4.8);
        addChar();
        System.out.println(conString());
    }
    public static int add(int a, int b){
      int c =a+b;

      return c;
    }
    public static void addDouble(double a, double b){
        System.out.println(a+b);

    }
    public static void addChar (){
        System.out.println((char) 'a'+'b');
    }
    public static String conString (){
        String a="hello ";
        String b="world";
        String c=a+b;

        return c ;

    }

}
