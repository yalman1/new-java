package inheritance;

public class OperationsMethodsTest {
    public static void main(String[] args) {
        OperationsMethods parent =new OperationsMethods();
        parent.add(1,2,3);
        parent.add(2,4);
        OperationsMethodAdvance child =new OperationsMethodAdvance();
        child.sumProduct(3,5,6);
        parent.multiply(2,5);
        child.multiply(4,3);
        System.out.println(parent.a+" "+parent.b+" "+parent.c);

    }
}
