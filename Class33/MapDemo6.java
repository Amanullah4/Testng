package Class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo6 {
    public static void main(String[] args) {

        HashMap<String, Double> storeItems=new HashMap<>();
        storeItems.put("Milk", 5.99);
        storeItems.put("Bread", 2.99);
        storeItems.put("Cake", 40.99);
        storeItems.put("Dieper", 39.99);
        storeItems.put("Eggs", 4.99);
        Set<String> itemNames=storeItems.keySet();
       Iterator<String> iterator =itemNames.iterator();
        while (iterator.hasNext()){
            String key= iterator.next();
            System.out.println(" key "+ key+" value "+storeItems.get(key));
        }



    }
}
