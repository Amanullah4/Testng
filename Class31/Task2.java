package Class31;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        // Create a Set of cities in which you want to make sure that insertion order
        // is maintained. Then remove any city that starts with “A”;
        Set<String> LinkedHasSet = new LinkedHashSet<>();
        LinkedHasSet.add("Kabul");
        LinkedHasSet.add("Dehli");
        LinkedHasSet.add("DC");
        LinkedHasSet.add("Istanbul");
        LinkedHasSet.add("Tashkan");
        LinkedHasSet.add("Dubai");
        LinkedHasSet.add("Abu Zabi");
        System.out.println(LinkedHasSet);
        LinkedHasSet.removeIf(s -> s.startsWith("A"));

    }
}
