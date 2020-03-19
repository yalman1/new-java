package constructor;

public class ShapesTest {
    public static void main(String[] args) {
        Shapes s1 = new Shapes();
        s1.printPyramid();
        Shapes s2 = new Shapes();
        s2.printPyramid(false);
        Shapes s3 = new Shapes('#',20,30,true);
        s3.printPyramid();
        s3.printRectangle();
    }

}
