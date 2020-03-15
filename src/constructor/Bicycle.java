package constructor;

public class Bicycle {
    String bicycleColor;
    int bicycleSize;
     public Bicycle (String color, int size){
         bicycleColor=color;
         bicycleSize=size;
     }
    public void goFats () {
        System.out.println("going fast");
    }
    public void goFast (String level){
        System.out.println("going " +level+" fast");
    }
    public void goSlowly (){
        System.out.println("crusing slowly");
    }

}
