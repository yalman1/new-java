package creating_classes;

public class NestedClassHouse {
    public static void main(String[] args) {
       // House.Room room =new House.Room(50);               if static
       // System.out.println(room instanceof House.Room);
        House myHouse =new House("1100 W. Airport", 5);
        House.Room  myRoom= myHouse.new Room(100.8);
        System.out.println(myRoom instanceof House.Room);
        myHouse.turnLight();
        myRoom.closeDoor();


    }
}
class House {
     int rooms;
    String address;

    public House(String address, int rooms) {
        this.address =address;
        this.rooms = rooms;
    }
    void turnLight (){
        System.out.println("Lights on");
    }
    void coolDown (){
        System.out.println("House is cooling down");
    }
    void warmUp (){
        System.out.println("House is warming up");
    }

    class Room{
       double size;

        public Room(double size) {
            this.size = size;
        }

        void openDoor(){
            System.out.println("Door opened");
        }
        void closeDoor (){
            System.out.println("Door closed");
        }
    }
}

