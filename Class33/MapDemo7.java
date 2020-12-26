package Class33;

import java.util.HashMap;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {
        HashMap<String, Double> storeItemsDay1=new HashMap<>();
        storeItemsDay1.put("Milk", 5.99);
        storeItemsDay1.put("Bread", 2.99);
        storeItemsDay1.put("Cake", 40.99);
        storeItemsDay1.put("Dieper", 39.99);
        storeItemsDay1.put("Eggs", 4.99);
        HashMap<String, Double> storeItemsDay2=new HashMap<>();
        storeItemsDay2.put("bear",12.0);
        storeItemsDay2.put("coffe",3.75);

        storeItemsDay2.putAll(storeItemsDay1);
        Set<String> set=storeItemsDay2.keySet();
        Double sum=0.0;
        for (String item:set){
            sum+=storeItemsDay2.get(item);
        }
        System.out.println("Total spending "+sum);
    }
}
