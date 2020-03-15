package constructor;

public class Cars {
    int modelYear;
    double engineVolume;
    String modelName;
     public Cars (int year, double engine, String model){
         modelYear=year;
         engineVolume=engine;
         modelName=model;
     }
     public void startEngine(){
         System.out.println("vroom");
     }
}
