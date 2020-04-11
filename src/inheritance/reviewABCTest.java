package inheritance;

public class reviewABCTest {
    public static void main(String[] args) {
        reviewA ob1 = new reviewA(10);
        System.out.println(ob1.getA());
        reviewB obj2 = new reviewB(2);
        System.out.println(obj2.getA());
        reviewC obj3 = new reviewC(5);
        System.out.println(obj3.getA());
        obj3.setA(40);
        System.out.println(ob1.getA());
        System.out.println(obj2.getA());
        System.out.println(obj3.getA());
    }
}
