package polymorphism;

public class ShapeCalculation {


    public static void calculateParameter (int edge1, int edge2, int edge3){
        System.out.println("Perimeter of triangle :"+(edge1+edge2+edge3));
    }
    public static void calculateParameter (int edge1){
        System.out.println("Perimeter of square :"+(4*edge1));
    }
    public static void calculateParameter (double radius){
        System.out.println("Perimeter of circle :"+(2*22/7*radius));
    }
    public void calculateArea (int a, int b){
        System.out.println("Area of the rectangle :"+(a*b));
    }
    public void calculateArea (int edge){
        System.out.println("Area of the square :"+(edge*edge));
    }
    public void calculateArea (double radius){
        System.out.println("Area of the Circle :"+(2*22/7*radius*radius));
    }

}
