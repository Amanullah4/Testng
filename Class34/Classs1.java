package Class34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Classs1 {
    public static void main(String[] args) {
        Map<Integer, String> beatBuyElectronic = new HashMap<>();
        beatBuyElectronic.put(788774, "Printer");
        beatBuyElectronic.put(757578, "TV");
        beatBuyElectronic.put(999988, "Laptop");
        beatBuyElectronic.put(88888, "DDD");
        beatBuyElectronic.put(65657, "Game");
        System.out.println(beatBuyElectronic);
        Iterator<Map.Entry<Integer, String>> iterator = beatBuyElectronic.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
        }
    }
}
