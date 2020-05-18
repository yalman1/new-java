package string_processing;

public class StringExample {
    public static void main(String[] args) {
        String a="abc";
        String b="abc";
        System.out.println("a ="+a.hashCode()+"\t b ="+b.hashCode());
        System.out.println(a==b);
        String c=new String("abc");
        String d=new String("abc");
        System.out.println("c="+c.hashCode()+"\t"+d.hashCode());
        System.out.println(c==d);
        System.out.println(a.equals(d));

        System.out.println("abc".compareTo("def"));
        System.out.println(10+10);             // addition
        System.out.println(""+10+10);     //concat
        System.out.println('0'+'0');     //add AIISL
    }
}
