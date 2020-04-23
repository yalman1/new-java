package hashMap;

import java.util.HashMap;

public class ExistOrNot {
    public static void main(String[] args) {
        HashMap<String, String > hm=new HashMap<>();
        hm.put("a","B");
        hm.put("b","B");
        hm.put("c","C");
        System.out.println(isHashKey(hm, "A"));

    }
    public static boolean isHashKey (HashMap<String, String > hMap, String keyToCheck){
        boolean result=false;
        for ( String key : hMap.keySet()){
            if (key.equals(keyToCheck)){
                result =true;
                break;
            }
        }
        return result;
    }
}
