package hashMap;

import java.util.HashMap;

public class FirstExample {
    public static void main(String[] args) {
        HashMap<String, String > list=new HashMap<>(4);
        list.put("Java", "Medium");
        list.put("SQL", "Entry");
        list.put("Selenium", "Master");
        list.put("Cucumber", "Expert");
        for (String key:list.keySet()) {
            System.out.println("key : " + key + "\t\tvalue :" + list.get(key));
        }
    }
}
