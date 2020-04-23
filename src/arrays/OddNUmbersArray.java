package arrays;

public class OddNUmbersArray {
    public static void main(String[] args) {
        int [] oddNumber={1,2,3,4,5,6,7,8,9,10,11};
        int sum=0;
        //to find some of odd numbers
        for (int i=0; i<oddNumber.length; i++) {
            if (oddNumber[i] % 2 != 0){
                sum=sum+oddNumber[i];
                System.out.println(oddNumber[i]);
            }
        }
        System.out.println("sum of odd numbers"+sum);
        int counter=0;
        //to find total number of odd numbers
        for (int i=0; i<oddNumber.length; i++){
            if (oddNumber[i]%2!=0){
                counter++;
            }
        }
        System.out.println("total number of odd numbers:"+counter);

    }

}
