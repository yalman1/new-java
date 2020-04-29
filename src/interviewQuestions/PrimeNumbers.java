package interviewQuestions;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(checkPrime1stWay(11));
        checkPrime2ndWay(12);
    }


    public static boolean checkPrime1stWay(int n) {
                 // check if the Number is Prime Number
                // 2,7,11,13
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void checkPrime2ndWay(int n) {
        if (n < 2) {
            System.out.println("False");
        }
        boolean prime=true;
        for (int i = 2; i < n; i++)
            if (n % i == 0) {
                prime=false;
                break; }
        System.out.println(n);
        System.out.println(prime);
    }

}
