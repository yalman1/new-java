package polymorphism;

public class StaticVariableTest {
    public static void main(String[] args) {
        StaticVariable o1 = new StaticVariable();
        StaticVariable.getA();
        o1.getB();
        StaticVariable o2 = new StaticVariable();
        StaticVariable.getA();
        o2.getB();
        StaticVariable o3 = new StaticVariable();
        StaticVariable.getA();
        o3.getB();
        /*
        System.out.println("b="+o1.b);
        System.out.println("a="+StaticVar.a);
        System.out.println("b="+o2.b);
        System.out.println("a="+StaticVar.a);
​
​
        StaticVar.getA();
        o1.getB();
        StaticVar.getA();
        o2.getB();
        */
    }

}
