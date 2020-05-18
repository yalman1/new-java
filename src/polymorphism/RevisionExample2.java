package polymorphism;

public class RevisionExample2 {
    public static void main(String[] args) {
        Appliance a=new Appliance(500);
        Appliance b= new Fridge(200, 2);
        Fridge c=new Fridge(300, 3);
        c.cool();
        ((Fridge) a).cool();
        Fridge d=(Fridge) b;
        Appliance e=d;

    }
}
class Appliance {
    int size;

    public Appliance(int size) {
        this.size = size;
    }

    void turnOn (){
        System.out.println("turning on");
    }
}
class Fridge extends Appliance{

    int doors;

    public Fridge(int size, int doors) {
        super(size);
        this.doors = doors;
    }

    void cool (){
        System.out.println("cooling");
    }
}