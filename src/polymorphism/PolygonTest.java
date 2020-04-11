package polymorphism;

public class PolygonTest {
    public static void main(String[] args) {
        Polygon plgn =new Polygon ();
        plgn.calculatePerimeter(10);
       polygonTriangle trg =new polygonTriangle();
       trg.calculatePerimeter(10);
       PolygonSquare sqr =new PolygonSquare();
       sqr.calculatePerimeter(10);
    }
}
