package abstraction;

public class DiceTest {
    public static void main(String[] args) {
        DiceCasino myDice =new DiceCasino();
        System.out.println(myDice.rollDice());
        DiceDarkCasino myDark =new DiceDarkCasino();
        System.out.println( myDark.rollDice());
    }
}
