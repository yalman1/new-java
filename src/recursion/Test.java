package recursion;

public class Test {
    static int count=1;

    public static void main(String[] args) {
        test1();
    }
    public static void test1 (){
        System.out.println("Recursion :"+count);
        count++;
        test1();
    }
}
