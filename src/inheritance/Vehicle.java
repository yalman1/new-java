package inheritance;

public class Vehicle {
    String color;
    int doors;

    public Vehicle(String color, int doors) {
        this.color = color;
        this.doors = doors;
    }
    public void honk(){

    }
}
class Car extends Vehicle {
    public Car(String color, int doors) {
        super(color, doors);
    }
    public void honk(){
        System.out.println("beep");
    }
}
class Bus extends Vehicle {
    public Bus(String color, int doors) {
        super(color, doors);
    }
    public void honk(){
        System.out.println("dutt");
    }
}
class VehicleTest {
    public static void main(String[] args) {
        Vehicle car =new Car("red", 4);
        Vehicle bus =new Bus("yellow", 2);
        car.honk();
        bus.honk();
    }


}
