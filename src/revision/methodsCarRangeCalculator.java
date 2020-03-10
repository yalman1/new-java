package revision;

public class methodsCarRangeCalculator {
    public static void main(String[] args) {
        carRangeReturn(282.5, 5);
        carRangeVoid(245.5,3);

    }
    public static int carRangeReturn (double mpg, int gallon){
        int range=0;
        double cal=mpg*gallon;
        return range;
    }
    public static void carRangeVoid (double mpg, int gallon){
        double range = mpg*gallon;
        System.out.println(range);
    }
}
