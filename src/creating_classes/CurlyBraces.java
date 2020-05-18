package creating_classes;

public class CurlyBraces {
    public static void main(String[] args) {
        Curly curly =new Curly(10);
    }
}
class Curly {
    int a;
    public Curly(int a) {
        this.a = a;
        System.out.println("Object created with parameter "+this.a);
    }
    {
        System.out.println(a);
    }
}
