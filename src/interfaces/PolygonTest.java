package interfaces;

public class PolygonTest {
    public static void main(String[] args) {
        PolygonTriangle trng =new PolygonTriangle();
        trng.calculatePerimeters(10);
        PolygonSquare sqr =new PolygonSquare();
        sqr.calculatePerimeters(10  );
    }
}
