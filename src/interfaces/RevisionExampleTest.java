package interfaces;

import java.util.Comparator;

public class RevisionExampleTest {
    public static void main(String[] args) {
        Laptop a=new Laptop();
        a.charge();
        RevisionExample b=new Laptop();
        b.turnOn();
        b.turnOff();

        System.out.println(a instanceof RevisionExample);
        System.out.println(b instanceof RevisionExample);
        System.out.println(a instanceof Laptop);
        System.out.println(b instanceof Laptop);
    }
}
class Laptop implements RevisionExample{
   public  void turnOn (){
       System.out.println( "ON");
    }
    public void turnOff (){
        System.out.println("OFF");

    }
    public void charge (){
        System.out.println("Charging");

    }
}
