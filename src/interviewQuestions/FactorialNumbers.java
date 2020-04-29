package interviewQuestions;

public class FactorialNumbers {
    public static void main(String[] args) {
        findFactorial(6);
    }

        public static void findFactorial(int num){
            int fact=1;
            for(int i=1;i<=num;i++)
            {
                fact=fact*i;
                // fact*=i;
            }
            System.out.println("The Result of the Factorial= "+ fact );
    }
}
