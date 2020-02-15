package First;

public class oddTriangle {
    public static void main (String []args ){
        int A=10;
        int B=15;
        int C=20;

        if ((A+B>C) && (A+C>B) && B+C>A){
            System.out.println("can form triangle");
        }

            else{
            System.out.println("can not form triangle");
        }
    }
}
