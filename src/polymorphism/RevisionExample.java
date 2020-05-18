package polymorphism;

import inheritance.Vehicle;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Vector;

public class RevisionExample {
    public static void main(String[] args) {
        Vehicles car =new Cars();
        car.start();
        Cars myCAr = (Cars) car;
        myCAr.turnLeft();
        ((Cars) car).turnRight();


    }
}
class Vehicles {
   void start (){
       System.out.println("Engine started");
   }

}
class Cars extends Vehicles {
    void turnLeft (){
        System.out.println("Left turning");
    }
    void turnRight (){
        System.out.println("turning right");
    }

}
