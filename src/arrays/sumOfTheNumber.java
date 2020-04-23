package arrays;

public class sumOfTheNumber {
    public static void main(String[] args) {
        int [] number ={1,2,3,4,5,6,7,8};
        int sum=0;
        for (int i=0; i<number.length; i++){
            sum+=number[i];
        }
        System.out.println(sum);

        int [] numbers ={1,2,3};
        int sun =0;
        for (int i=0; i<numbers.length; i++){
            sun+=numbers [i];
        }
        System.out.println(sun);
    }
}
