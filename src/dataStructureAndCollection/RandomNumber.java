package dataStructureAndCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random myRand = new Random();
       // System.out.println(Math.abs(myRand.nextInt(1000) ));
        ArrayList<Integer> myArr =new ArrayList<Integer>();
        //System.out.println(myArr.size());
        for (int i=0; i<20; i++){
            myArr.add (Math.abs(myRand.nextInt(1000)));

        }
        System.out.println(myArr);
        Collections.sort(myArr);
        System.out.println(myArr);
        System.out.println(myArr.get(0));
        System.out.println(myArr.get(myArr.size()-1));

    }
}
