package Class33;

import java.util.HashMap;
public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(100,"Jack");
        map.put(110,"Ali");
        map.put(110,"Jan");
        map.put(222,"Ahmad");
        map.put(333,"Karim");
        System.out.println(map); //using Hashmap it implement insertion order
        System.out.println(map.get(110));

    }
}

