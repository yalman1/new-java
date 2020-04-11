package inheritance;

public class OperationsMethods {
    public int a;
    public int b;
    public int c;

    public OperationsMethods (){
        this.a=10;
        this.b=20;
        this.c=30;
    }
    public OperationsMethods (int a){
        this.a=a;
        this.b=20;
        this.c=30;
    }



    void add (int a, int b){
        System.out.println(a+b);
    }
    void add (int a, int b, int c){
        System.out.println(a+b+c);
    }
    void multiply (int a, int b){
        System.out.println(a*b);
    }

}
