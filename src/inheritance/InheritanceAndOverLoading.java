package inheritance;

public class InheritanceAndOverLoading {
    public void doIt (){
        System.out.println("Hello");
    }
}
class Child extends InheritanceAndOverLoading{
    public void doIt (){  //overloading    public void doIt () overriding
        System.out.println("hi");           // System.out.println("word");
    }

}