package revision;

import java.util.Arrays;
public class SeparateZeros {
    public static void main(String[] args) {
        int []num={0,5,4,2,1,0};
        int [] result =zeroSeparate(num);
        System.out.println(Arrays.toString(result));
    }
    public static int[] zeroSeparate (int [] arr){
        int []numbers=new int[arr.length];
        int result=0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0){
                numbers[result]=arr[i];
                result++;

                }
        return numbers;
            }

        }


