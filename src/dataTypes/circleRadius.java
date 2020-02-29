package dataTypes;
import java.util.Scanner;
public class circleRadius {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        float radius;
        System.out.print("please enter circle radius");
        radius = myScan.nextFloat();
        float prmtr= 2*3.14f*radius;
        System.out.println("Perimeter is: " + prmtr);
        System.out.println("The perimeter of this circle is: " + (2 * 3.14 * radius));
        System.out.format("perimeter with 3 fractional part : %.3f", (2 * 3.14 * radius));
    }
}