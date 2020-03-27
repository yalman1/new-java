package override;

public class BTest {
    public static void main(String[] args) {
        A a =new A();
        A c =new A_B ();
        A_B b = new A_B();
        b.printMessage();
        a.printMessage();
        c.printMessage();
    }

}
