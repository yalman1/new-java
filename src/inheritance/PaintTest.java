package inheritance;

public class PaintTest {
    public static void main(String[] args) {
        Paint myPaint = new Paint("zero gravity",2800);
        System.out.println(myPaint.toString());
        System.out.println(myPaint.calculatePrice());
        PaintCustom myCustomPaint = new PaintCustom("moon blue",3200,"durable","extra glossy");
        System.out.println(myCustomPaint.calculateCustomPrice());
    }

}
