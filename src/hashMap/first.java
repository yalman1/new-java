package hashMap;

import java.util.HashMap;

public class first {
    public static void main(String[] args) {
        HashMap<String, Integer> list =new HashMap<>();
        System.out.println(list);
        list.put("Java", 100);
        System.out.println(list);
        list.put("selenium", 99);
        System.out.println(list);
        System.out.println(list.get("selenium"));
        System.out.println(list.size());

        // printing the keys
        for (String key:list.keySet()){
            System.out.println(key);
        }
        // printing value
        for (int value:list.values()){
            System.out.println(value);
        }
        //printing keys and values
        for (String key:list.keySet()){
            System.out.println("key :\t\t"+key+"value :\t\t\t"+list.get(key));
        }

    }

}
