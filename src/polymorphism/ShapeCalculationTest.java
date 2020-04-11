package polymorphism;

public class ShapeCalculationTest {
    public static void main(String[] args) {
        ShapeCalculation.calculateParameter(10);
        ShapeCalculation.calculateParameter(10.0);
        ShapeCalculation.calculateParameter(10,10,10);
        ShapeCalculation myShapes =new ShapeCalculation ();
        myShapes.calculateArea(10);
        myShapes.calculateArea(10,20);
        myShapes.calculateArea(10.0);

    }
}
