package abstraction;

public class queteTilingTest {
    public static void main(String[] args) {
       QueteTiling myTiles =new QueteTiling("alma", 5000, 0, "wood");
        System.out.println(myTiles.calculateTotalMaterialPrice());
        myTiles.printQuete();
    }
}
