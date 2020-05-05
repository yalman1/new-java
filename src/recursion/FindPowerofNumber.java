package recursion;

public class FindPowerofNumber {
    public static void main(String[] args) {
        System.out.println(powerOf(2,20));

    }
    public  static long powerOf (int base, int n){

        if (n==0){
            return 1;
        }
        else {
                return base *powerOf(base, n-1);

        }
    }

}
