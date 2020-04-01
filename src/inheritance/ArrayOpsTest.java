package inheritance;

public class ArrayOpsTest {
    public static void main(String[] args) {
        ArrayOps myArr =new ArrayOps();
        int [] num={1,2,3,4,5,6};
       int index=myArr.findIndex(num, 2);
        System.out.println(index);
        StatArrays myStat =new StatArrays();
       int result =myStat.findAverage(4,6);
        System.out.println(result);
        int [] num2={1,15,3,6,5,6};
        int min = myStat.findMaximum(num2);
        System.out.println(min);
        int max =myStat.findMinimum(num2);
        System.out.println(max);

    }
}
