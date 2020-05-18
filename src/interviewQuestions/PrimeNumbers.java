package interviewQuestions;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(checkPrime1stWay(11));
        checkPrime2ndWay(12);
        printPrimeNumbers(100);
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
    public static void printPrimeNumbers (int limit){
        int count;
        for (int i = 0; i <limit ; i++) {
            count=0;
            for (int j = i; j >=1 ; j--) {
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.println(i);
            }
        }
    }

}
