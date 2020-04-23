package hashMap;

import java.util.HashMap;

public class Second {
    public static void main(String[] args) {
        HashMap<String, Integer> list = new HashMap<>(4);
        list.put("Los Angeles", 85);
        list.put("Chicagi", 30);
        list.put("Denver", 55);
        list.put("Orlando", 90);


        int sum=0;
        double average;
        for (int temp: list.values()){
            sum+=temp;

        }
        average=sum/list.size();
        System.out.format("Average temp : %.2f",average);


    }
}
