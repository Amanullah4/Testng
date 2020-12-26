package Class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(100,"Jack");
        hashMap.put(110,"Ali");
        hashMap.put(111,"Jan");
        hashMap.put(222,"Ahmad");
        hashMap.put(333,"Karim");

        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey()+""+next.getValue());
        }
       // System.out.println(hashMap);
       // hashMap.entrySet().stream().iterator();
     //   Set<String> set = new HashSet<>();
   //     Iterator<String> sets=set.iterator();
    //    Map.Entry<String,Integer> mapEntry;
     //   System.out.println(ne);
    }
}
