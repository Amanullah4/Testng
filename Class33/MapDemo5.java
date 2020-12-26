package Class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jack",222);
        hashMap.put("Ali", 333);
        hashMap.put("Jan",444);
        hashMap.put("Ahmad",555);
        hashMap.put("Karim",666);
        Set<String> keySet=hashMap.keySet();
        for (String key : keySet) {
            System.out.println(key);
            System.out.println(hashMap.get(key));
         //   Iterator<Integer> iterator = keySet.iterator();
        }
    }
}