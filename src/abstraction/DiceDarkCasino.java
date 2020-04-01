package abstraction;

public class DiceDarkCasino extends DiceCasino {
    public int roleDice (){
        return (int)(Math.random()*10)+1;
    }


}
