package interviewQuestions;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        swapNumbers(4,11);

    }
    public static void swapNumbers (int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a+ " "+b);
    }
}
