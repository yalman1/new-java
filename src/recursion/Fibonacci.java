package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(100));

    }
    public static long fib (int number){
        if (number<=1){
            return 1;
        }
        else {
            return fib(number-1) + fib(number -2);
        }
    }
}
