package constructor;

public class CarsTest {
    public static void main(String[] args) {
        Cars camry = new Cars(2016,2.5,"Camry");
        System.out.println("Model  : \t\t"+camry.modelName+
                "\nYear   : \t\t"+camry.modelYear+
                "\nEngine : \t\t"+camry.engineVolume);
        camry.startEngine();
    }

}
