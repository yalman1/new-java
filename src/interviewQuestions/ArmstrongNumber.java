package interviewQuestions;

public class ArmstrongNumber {
    public static void main(String[] args) {

    }
    public static void armstrongNum (int num){
        //armstrong number
        // 153=1^3+5^3+3^3
        //407=4^3+0^3+7^3

        //153/10=remaining number 3  15
        int digits;
        int sum=0;
        int temp=num;
        while(temp>0){
            digits= temp%10;
            sum+=(digits*digits*digits);
            temp= temp/10;

        }
        if (num==sum){
            System.out.println("Armstrong :"+num);
        }else
            System.out.println("Not armstrong ");

    }
}
