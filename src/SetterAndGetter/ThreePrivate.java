package SetterAndGetter;

public class ThreePrivate {
   int a;
    int b;
   int c;

    public ThreePrivate() {
        this.a = a=10;
        this.b = b=20;
        this.c = c=30;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "ThreePrivate{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }



}
