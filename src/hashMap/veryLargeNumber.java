package hashMap;

import java.util.HashMap;

public class veryLargeNumber {
    public static void main(String[] args) {
        /*
        String s="12345678";
        String first3=s.substring(0,3);
        int num =Integer.parseInt(first3);
        num++;
        System.out.println(num);
        */

        String test="123412345123456";
        findTriples(test);
    }
    public static void findTriples (String number){
        String first3=number.substring(0,3);
        int number3=Integer.parseInt(first3);
        HashMap<Integer, Integer> hm=new HashMap<>();
        hm.put(number3,1);
        String other3;
        int numberOther3;
        for (int i=0; i<number.length()-2; i++ ){
            other3=number.substring(i, i+3);
            numberOther3=Integer.parseInt(other3);
            if (hm.containsKey(numberOther3)){
                hm.put(numberOther3,hm.get(numberOther3)+1);
            }
            else{
                hm.put(numberOther3,1);
            }
        }
        //System.out.println(hm);
        for (int key: hm.keySet()){
            if(hm.get(key)>1){
                System.out.println("There are "+hm.get(key)+" "+key+" in the number");
            }
        }
    }
}
