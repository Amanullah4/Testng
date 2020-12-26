package Class33;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(100,"Jack");
        hashMap.put(110,"Jan");
        hashMap.put(111,"Ali");
        hashMap.put(222,"Ahmad");
        hashMap.put(333,"Karim");
        System.out.println(hashMap);
        hashMap.remove("Ali");
        System.out.println(hashMap);
        hashMap.put(555, "Valid");
        System.out.println(hashMap.get("Ahmad"));
        System.out.println(hashMap.containsKey("Jack"));
    }
}
