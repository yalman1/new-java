package abstraction;

public class DiceCasino extends Dice {
    public int rollDice(){
        int result =(int)(Math.random()*super.faces)+1;
        return result;
    }
}
