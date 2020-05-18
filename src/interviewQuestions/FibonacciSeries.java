package interviewQuestions;

public class FibonacciSeries {
    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i++) {
            System.out.println(fib(i) );

        }
        int a=0;
        int b=1;
        int c;
        for (int i = 0; i <11 ; i++) {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }
    }
    public static int fib (int seq){
        if (seq<=1){
            return seq;
        }
        else {
            return fib(seq-2)+fib(seq-1);
        }
    }
}
