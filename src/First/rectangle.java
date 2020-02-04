package First;
import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner scannerMine = new Scanner(System.in);
        System.out.print("please enter the width:");
        int width;
        width = scannerMine.nextInt();
        int height;
        System.out.print("please enter the height:");
        height = scannerMine.nextInt();
        System.out.format("the area of the rectangle with %d and %d is %d", width, height, width*height);


    }
}
