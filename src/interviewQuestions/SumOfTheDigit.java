package interviewQuestions;

public class SumOfTheDigit {
    public static void main(String[] args) {
        sumOfDigits(1345);
    }

    public static void sumOfDigits(int num) {
                //Sum of the digits
                //1236=6+3+2+1=12
        int digits;
        int sum = 0;
        while (num > 0) {
            digits = num % 10;
            sum=sum+digits ;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
