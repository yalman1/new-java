package inheritance;

public class A_C  extends A_B {
    protected int z;

    public A_C(int z, int x, int y) {

        super(y,x);
        this.z = z;
    }
}
