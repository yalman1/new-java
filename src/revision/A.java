package revision;

import java.util.Arrays;

public class A {
    public static void main(String[] args) {
       int ints[]={7,5,2,4,0};
       try{
           Arrays.sort(ints,0,6);
           for (int i : ints)
               System.out.println(i);
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("arry index");

       }
       finally {

       }

    }
}