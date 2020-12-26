package Class31;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        Set<String> LinkedHasSet = new LinkedHashSet<>();
        LinkedHasSet.add("Apple");
        LinkedHasSet.add("Mango");
        LinkedHasSet.add("Orange");
        LinkedHasSet.add("Banana");
        LinkedHasSet.add("Apple");
        LinkedHasSet.add("KIVI");
        System.out.println(LinkedHasSet);
    }
}
