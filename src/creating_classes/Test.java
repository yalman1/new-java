package creating_classes;

public class Test {
    public static void main(String[] args) {
        System.out.println("Java is fun (from main)");
        Test.main("it is fun");
    }
    public static void main(String arg1) {
        System.out.println("Yes "+arg1);
        Test.main("it is fun", "indeed");

    }
    public static void main(String arg1, String arg2) {
        System.out.println("Right, " +arg1+",  "+arg2);
    }
}
