package Class33;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<Integer, String> Hashmap=new HashMap<>();
        Hashmap.put(100,"Jack");
        Hashmap.put(110,"Ali");
        Hashmap.put(110,"Jan");
        Hashmap.put(222,"Ahmad");
        Hashmap.put(333,"Karim");
        System.out.println(Hashmap);// using Map it doesn't implement insertion order.

        Map<Integer, String> linkedHashMap=new LinkedHashMap<>();//
        linkedHashMap.put(100,"Jack");
        linkedHashMap.put(110,"Ali");
        linkedHashMap.put(110,"Jan");
        linkedHashMap.put(222,"Ahmad");
        linkedHashMap.put(333,"Karim");
        System.out.println(linkedHashMap);//using LinkedhashMap it implement insertion order.

        Map<Integer, String> treeMap=new TreeMap<>();
        treeMap.put(100,"Jack");
        treeMap.put(110,"Ali");
        treeMap.put(110,"Jan");
        treeMap.put(222,"Ahmad");
        treeMap.put(333,"Karim");
        treeMap.put(333,"Zaidan");
        treeMap.put(333,"Valid");
        System.out.println(treeMap);//using treeMap oreder in implements olpahbetic order
    }
}
