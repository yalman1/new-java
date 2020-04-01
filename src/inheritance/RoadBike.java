package inheritance;

public class RoadBike extends Bicycle  {

    int tireSize;
  int handleBarSize;

   public RoadBike (int tireSize,int handleBarSize, int gear, int speed){
       super(gear, speed );
       this.tireSize=tireSize;
       this.handleBarSize=handleBarSize;

   }

}
