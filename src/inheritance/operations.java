package inheritance;

public class operations {
    private static int additionPrivateStatic (int a, int b){
        return a+b;
    }
    {
        additionPrivateStatic(10,3);    //class name is also possible,
                                             // static can not be seen with this.
    }
    public static int additionPublicStatic (int a, int b){
        return a+b;
    }
    private int additionPrivate (int a , int b){
        return a+b;
    }
    {
        additionPrivate(3,6);
    }
    public int additionPublic (int a, int b){
        return a+b;
    }
}
