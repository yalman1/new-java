package constructor;

public class bicycleTest {
    public static void main(String[] args) {
        Bicycle myBicycle =new Bicycle("blue", 12);
        myBicycle.goFats();
        myBicycle.goFast("crazy");
        myBicycle.goSlowly();
        System.out.println("my bicycle color is: "+myBicycle.bicycleColor+
                "\nmy bicycle size is:"+myBicycle.bicycleSize);
    }
}
