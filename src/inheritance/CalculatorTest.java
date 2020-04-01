package inheritance;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator myCal =new Calculator ();
        AdvancedCalculator myAdvance =new AdvancedCalculator();
        System.out.println(myAdvance.calcFactorial(10));

    }
}
